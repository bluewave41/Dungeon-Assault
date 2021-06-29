import { applySession } from 'next-session';
import { getMovableTiles } from 'lib/Utilities';
import RaidDungeon from 'models/RaidDungeon';
import RaidStatus from 'models/RaidStatus';

export default async function handler(req, res) {
    await applySession(req, res);

    //TODO: is logged in

    const { status } = await RaidStatus.query().select('status')
        .findOne('userId', req.session.user.userId);

    if(status == 1) {
        res.status(400).json({ error: "You haven't selected a starting corner. "});
        return res.end();
    }
    else if(status == 2) {
        res.status(400).json({ error: "You don't have an active raider." });
        return res.end();
    }

    let tiles = await getMovableTiles(req.session.user.userId);

    if(!tiles.includes(req.body.tile)) {
        res.status(400).json({ error: "You cannot move to that tile yet." });
        return res.end();
    }

    //can move there

    const { trapId, tile:tileId } = await RaidDungeon.query().select('trapId', 'tile')
        .findOne('userId', req.session.user.userId)
        .findOne('tile', req.body.tile);

    if(!trapId) { //no trap there
        await RaidDungeon.query().update({
            visited: true
        })
        .where('userId', req.session.user.userId)
        .where('tile', req.body.tile);

        tiles = await getMovableTiles(req.session.user.userId); //re grab since we visited a new tile

        res.status(200).json({ movable: tiles, tileId: tileId, trap: trapId });
        res.end();
    }
    else {
        //send the trap
    }
}