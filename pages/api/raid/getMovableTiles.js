import { applySession } from 'next-session';
import { getMovableTiles } from 'lib/Utilities';

export default async function handler(req, res) {
    await applySession(req, res);
    //TODO: is logged in

    const tiles = await getMovableTiles(req.session.user.userId);
    
    res.status(200).json({ tiles: tiles });
    res.end();
}