const User = require('models/User');
const crypto = require('crypto');
const bcrypt = require('bcrypt');
import applySession from 'next-session';

export default async function handler(req, res) {
    await applySession(req, res);

    const { username, password } = req.body;

    if(!username) {
        res.status(400).json({ error: "You didn't enter your username." });
        return res.end();
    }
    if(!password) {
        res.status(400).json({ error: "You didn't enter your password. "});
        return res.end();
    }

    const user = await User.query().select('id', 'username', 'password')
        .findOne('username', username);

    const shaPassword = crypto.createHash('sha256').update(password).digest('hex');

    const result = await bcrypt.compare(shaPassword, user.password);
    if(result) {
        req.session.user = { id: user.id, username: user.username };
        res.status(200);
        res.end();
    }
    else {
        res.status(401);
        res.end();
    }
}