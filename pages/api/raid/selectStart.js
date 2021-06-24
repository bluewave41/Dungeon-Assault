import { applySession } from 'next-session';
import RaidStatus from 'models/RaidStatus';

export default function handler(req, res) {
    await applySession(req, res);

    //check if logged in

    //get status
    const { status } = await RaidStatus.query().select('status')
        .findOne('userId', req.session.user.userId);
    //check if status valid


    if(status != 1) {
        res.status(400).json({ error: "You've already selected a starting tile." });
        return res.end();
    }

    //check if tile corner
    if(req.body.tile != 0 && req.body.tile != 6 && req.body.tile != 42 && req.body.tile != 48) {
        res.status(400).json({ error: "You can only start on a corner tile." });
        return res.end();
    }

    //update
    await RaidStatus.query().update({
        currentTile: req.body.tile,
        status: 2
    })
    .where('userId', req.session.user.userId);
}