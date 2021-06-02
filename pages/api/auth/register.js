const bcrypt = require('bcrypt');
const crypto = require('crypto');
const User = require('models/User');
const Dungeon = require('models/Dungeon');
const DungeonGenerator = require('lib/DungeonGenerator');

export default async function handler(req, res) {
	const { username, password } = req.body;

    if(!username) {
        res.status(400).json({ error: "Your username cannot be empty." });
        return res.end();
    }
    if(!password) {
        res.status(400).json({ error: "Your password cannot be empty." });
        return res.end();
    }
    if(username.length > 20) {
        res.status(400).json({ error: "Usernames must be between 1 and 20 characters long." });
        return res.end();
    }

    const user = await User.query().select(1)
        .where('username', username);

    if(user.length) {
        res.status(400).json({ error: "That username is already taken." });
        return res.end();
    }

    const hashedPassword = await bcrypt.hash(crypto.createHash('sha256').update(password).digest('hex'), 10);
    console.log(hashedPassword);

    const row = await User.query().insert({
        username: username,
        password: hashedPassword
    });

    const dungeon = await DungeonGenerator.generate();
    console.log(dungeon);

    await Dungeon.query().insert({
        userId: row.id,
        seed1: dungeon[0],
        seed2: dungeon[1],
        seed3: dungeon[2]
    });

    res.status(200);
    res.end();
}