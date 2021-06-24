import { applySession } from 'next-session';

export default async function handler(req, res) {
    await applySession(req, res);
    req.session.destroy();
    res.status(200);
    res.end();
}