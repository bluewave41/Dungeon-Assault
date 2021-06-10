const User = require('models/User');
const crypto = require('crypto');
const bcrypt = require('bcrypt');
const { applySession } = require('next-session');

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

    const user = await User.query().select('userId', 'username', 'password')
        .findOne('username', username);

    if(!user) {
        res.status(401).json({ error: "That username doesn't exist." });
        return res.end();
    }

    const shaPassword = crypto.createHash('sha256').update(password).digest('hex');

    const result = await bcrypt.compare(shaPassword, user.password);
    if(result) {
        req.session.user = { userId: user.userId, username: user.username };
        res.status(200);
        return res.end();
    }
    else {
        res.status(401);
        return res.end();
    }
}