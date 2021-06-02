import { applySession } from 'next-session';
import StableModel from 'models/Stable';
import UserModel from 'models/User';
import RaiderModel from 'models/Raider';

export default async function handler(req, res) {
    await applySession(req, res);

    const user = await UserModel.query().select('gold')
        .findOne('userId', req.session.user.userId);

    if(!user) {
        res.status(400).json({ error: "You aren't logged in. "});
        return res.end();
    }

    const stable = await StableModel.query().select('*')
        .where('userId', req.session.user.userId);

    const raiders = await RaiderModel.query().select('raiderId', 'treasure');

    const { newStable } = req.body;

    let raidersToUpdate = [];
    let raidersToAdd = [];

    //for each sent raider
    for(var i=0;i<newStable.length;i++) {
        if(!newStable[i]) { //if the slot is empty
            continue;
        }
        newStable[i].slot = i+1;
        //is there already a raider in that slot?
        let ownedRaider = stable.find(el => el.slot == i+1);
        if(ownedRaider) {
            if(compare(ownedRaider, newStable[i])) { //are they the same?
                continue;
            }
            else { //they're different so one was overwritten or dismissed
                user.gold += Math.floor(raiders.find(el => el.raiderId == stable[i].raiderId).treasure / 2);
                user.gold -= Math.floor(raiders.find(el => el.raiderId == newStable[i].raiderId).treasure / 2);
            }
        }
        else { //we inserted a new raider
            user.gold -= Math.floor(raiders.find(el => el.raiderId == newStable[i].raiderId).treasure);
            raidersToAdd.push(newStable[i]);
        }
    }

    if(user.gold < 0) {
        res.status(400).json({ error: "You don't have enough gold for this stable. "});
        return res.end();
    }

    //update gold
    await UserModel.query().update({
        gold: user.gold
    })
    .where('userId', req.session.user.userId);

    for(var i=0;i<raidersToAdd.length;i++) {
        let raider = raidersToAdd[i];
        if(!raider) {
            continue;
        }
        await StableModel.query().insert({
            userId: req.session.user.userId,
            raiderId: raider.raiderId,
            slot: raider.slot, 
            attack: raider.attack,
            defence: raider.defence,
            dodge: raider.dodge,
            sneak: raider.sneak
        });
    }

    return res.end();
}

function compare(raider, raider2) {
    return raider.attack == raider2.attack && raider.defence == raider2.defence && raider.sneak == raider2.sneak && raider.dodge == raider2.dodge && 
        raider.raiderId == raider2.raiderId;
}