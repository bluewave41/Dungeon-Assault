import { applySession } from 'next-session';
import Stable from 'models/Stable';
import RaidStatus from 'models/RaidStatus';

export default async function handler(req, res) {
    //TODO: is logged in
    await applySession(req, res);

    const { status } = await RaidStatus.query().select('status')
        .findOne('userId', req.session.user.userId);

    if(status != 2 && status != 3) {
        res.status(400).json({ error: "You need to select a corner first." });
        return res.end();
    }

    const slot = req.body.slot;

    if(!Number.isInteger(parseInt(slot))) {
        res.status(400).json({ error: "Invalid raider selected. "});
        return res.end();
    }

    if(slot < 0 || slot > 8) {
        res.status(400).json({ error: "Selected raider slot is out of bounds." });
        return res.end();
    }

    const raiders = await Stable.query().select()
        .where('userId', req.session.user.userId);

    const raider = raiders.find(el => el.slot == slot);

    if(!raider) {
        res.status(400).json({ error: "You don't have a raider in that slot." });
        return res.end();
    }
    
    await RaidStatus.query().update({
        selectedSlot: slot,
        status: 3
    })
    .where('userId', req.session.user.userId);

    res.status(200);
    res.end();
}