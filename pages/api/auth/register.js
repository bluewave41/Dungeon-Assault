const bcrypt = require('bcrypt');
const crypto = require('crypto');
const User = require('models/User');
const DungeonGenerator = require('lib/DungeonGenerator');
const DungeonTiles = require('models/DungeonTiles');

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

    let [seed1, seed2, seed3] = await DungeonGenerator.generate();

    const row = await User.query().insert({
        username: username,
        password: hashedPassword,
        seed1: seed1,
        seed2: seed2,
        seed3: seed3
    });

    if(seed1 < 0) {
        seed1 = seed1 >>> 0;
    }
    if(seed2 < 0) {
        seed2 = seed2 >>> 0;
    }
    if(seed3 < 0) {
        seed3 = seed3 >>> 0;
    }

    let path = createEmptypath();

    //parse seed 1
    while(seed1 != 0) {
        let power = getLowestPowerOf2(seed1);
        let row = Math.floor(power.times / 6);
        let index = (power.times % 6);
        path[row][index].right = true;
        path[row][index+1].left = true;
        seed1 -= power.value;
    }
    
    //parse seed 2
    while(seed2 != 0) {
        let power = getLowestPowerOf2(seed2);
        if(power.value >= 1024) { //start doing downs
            let times = power.times - 10; //number of times it takes to get to 1024
            let row = Math.floor(times / 7);
            let index = (times % 7);
            path[row][index].down = true;
            path[row+1][index].up = true;
        }
        else { //sideways
            let row = 5 + Math.floor(power.times / 6);
            let index = 2 + (power.times % 6);
            if(index >= 6) {
                row++;
                index -= 6;
            }
            path[row][index].right = true;
            path[row][index+1].left = true;
        }
        seed2 -= power.value;
    }
    
    //parse seed3
    while(seed3 != 0) {
        //starts at 3, 1
        let power = getLowestPowerOf2(seed3);
        let row = 3 + Math.floor(power.times / 7);
        let index = 1 + (power.times % 7);
        if(index >= 7) {
            row++;
            index -= 7;
        }
        path[row][index].down = true;
        path[row+1][index].up = true;
        seed3 -= power.value;
    }

    let tileNum = 0;

    for(var x=0;x<7;x++) {
        for(var y=0;y<7;y++) {
            let square = path[x][y];
            let id = 0;
            if(square.up) {
                id += 1;
            }
            if(square.left) {
                id += 2;
            }
            if(square.right) {
                id += 4;
            }
            if(square.down) {
                id += 8;
            }
            await DungeonTiles.query().insert({
                userId: row.id,
                tile: tileNum++,
                movement: id,
            })
        }
    }

    res.status(200);
    res.end();
}

function createEmptypath() {
    let a = [];
    for(var x=0;x<7;x++) {
        let row = [];
        for(var y=0;y<7;y++) {
            row.push({ up: false, left: false, right: false, down: false });
        }
        a.push(row);
    }
    return a;
}

function getLowestPowerOf2(num) {
    let times = 0;
    let current = 2;
    while(current <= num) {
        current *= 2;
        times++;
    }
    if(current == 2) {
        return { times: 0, value: 1}
    }
    return { times: times, value: current/2 }
}