import { applySession } from 'next-session';
import RaidStatus from 'models/RaidStatus';
import User from 'models/User';
import RaidDungeon from 'models/RaidDungeon';
import DungeonTiles from 'models/DungeonTiles';

export default async function(req, res) {
    await applySession(req, res);
    //check if logged in
    if(!req.session.user) {
        res.status(401).json({ error: "You aren't logged in. "});
        return res.end();
    }

    //validate raider choices
    const raiders = req.body.raiders;

    //is the correct number selected?
    if(raiders.length < 0 || raiders.length > 4) {
        res.status(400).json({ error: "Invalid number of raiders received." });
        return res.end();
    }

    //slot numbers should only be from 1 to 8
    for(var i=0;i<raiders.length;i++) {
        if(raiders[i] < 1 || raiders[i] > 8) {
            res.status(400).json({ error: "Invalid slot number received." });
            return res.end();
        }
    }

    const target = await User.query().select('userId')
        .findOne('username', req.body.target);

    await RaidStatus.query().delete()
        .where('userId', req.session.user.userId);
    await RaidDungeon.query().delete()
        .where('userId', req.session.user.userId);

    await RaidStatus.query().insert({
        userId: req.session.user.userId,
        targetId: target.userId,
        status: 1,
        currentTile: 0,
        raider1: raiders[0],
        raider2: raiders[1],
        raider3: raiders[2],
        raider4: raiders[3]
    })

    //copy dungeon into raid_dungeon

    //get the target dungeon
    const targetDungeon = await DungeonTiles.query().select('tile', 'movement', 'trapId')
        .where('userId', target.userId);

    //add our userId
    targetDungeon.forEach(el => el.userId = req.session.user.userId);

    await RaidDungeon.knex().table('raid_dungeon').insert(targetDungeon);

    res.status(200);
    return res.end();

    //slot numbers are valid and correct number of raiders were selected
}