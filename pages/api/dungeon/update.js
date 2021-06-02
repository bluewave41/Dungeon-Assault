import { applySession } from 'next-session';
import UserModel from 'models/User';
import DungeonModel from 'models/Dungeon';
import TrapModel from 'models/Trap';

export default async function(req, res) {
    await applySession(req, res);

    const user = await UserModel.query().select('gold') 
        .findOne('userId', req.session.user.userId);

    if(!user) {
        res.status(400).json({ error: "You aren't logged in. "});
        return res.end();
    }

    const dungeon = (await DungeonModel.query().select('*')
        .findOne('userId', req.session.user.userId)).getPlacedTraps(); //convert to 2d array

    const traps = await TrapModel.query().select();

    const newDungeon = req.body.newDungeon;

    let updateObject = {};

    for(var x=0;x<dungeon.length;x++) {
        for(var y=0;y<dungeon.length;y++) {
            if(dungeon[x][y] != newDungeon[x][y]) {
                updateObject['tile' + (x*7 + y + 1)] = newDungeon[x][y];
                let trap = traps.find(el => el.id == newDungeon[x][y]);
                if(dungeon[x][y] == 0) { //empty
                    user.gold -= trap.treasure;
                }
                else { //replacing
                    let oldTrap = traps.find(el => el.id == dungeon[x][y]);
                    //refund half cost
                    user.gold += Math.floor(oldTrap.treasure/2);
                    user.gold -= trap.treasure;
                }
            }
        }
    }

    if(user.gold < 0) {
        res.status(400).json({ error: "You don't have enough gold for this dungeon. "});
        return res.end();
    }

    //update gold
    await UserModel.query().update({
        gold: user.gold
    })
    .where('userId', req.session.user.userId);

    //update dungeon
    await DungeonModel.query().update(updateObject)
        .where('userId', req.session.user.userId);
}