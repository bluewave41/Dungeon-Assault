import { applySession } from 'next-session';
import UserModel from 'models/User';
import DungeonTiles from 'models/DungeonTiles';
import TrapModel from 'models/Trap';

export default async function(req, res) {
    await applySession(req, res);

    const user = await UserModel.query().select('gold') 
        .findOne('userId', req.session.user.userId);

    if(!user) {
        res.status(400).json({ error: "You aren't logged in. "});
        return res.end();
    }

    const tiles = await DungeonTiles.query()
        .where('userId', req.session.user.userId);

    const traps = await TrapModel.query().select();

    const changes = req.body.changes;

    for(var i=0;i<changes.length;i++) {
        //ensure user has enough renown
        //make sure trap exists
        let change = changes[i];
        let newTrap = traps.find(el => el.trapId == change.trapId);
        if(tiles[change.tile].trapId) { //overwriting trap
            let oldTrap = traps.find(el => el.trapId == tiles[change.tile].trapId); //get the old trap
            user.gold += Math.floor(oldTrap.treasure / 2);
            user.gold -= newTrap.treasure;
        }
        else { //adding trap
            user.gold -= newTrap.treasure;
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

    for(var i=0;i<changes.length;i++) {
        await DungeonTiles.query().update({
            trapId: changes[i].trapId
        })
        .where('userId', req.session.user.userId)
        .where('tile', changes[i].tile);
    }
}