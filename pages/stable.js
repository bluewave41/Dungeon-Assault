import { applySession } from 'next-session';
import Raider from 'models/Raider';
import User from 'models/User';
import StableModel from 'models/Stable';
import StablePanel from 'components/stable/StablePanel';

const Stable = (props) => {
    return (
        <StablePanel raiders={props.raiders} user={props.user} ownedRaiders={props.ownedRaiders} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);
    console.log(req.session)

    const raiders = await Raider.query();
    const user = await User.query().select('gold')
        .findOne('userId', req.session.user.userId);

    const ownedRaiders = await StableModel.query().select('*')
        .where('userId', req.session.user.userId);

    let parsedRaiders = [];

    for(var i=0;i<ownedRaiders.length;i++) {
        let newRaider = raiders.find(el => el.raiderId == ownedRaiders[i].raiderId);
        newRaider.attack = ownedRaiders[i].attack;
        newRaider.defence = ownedRaiders[i].defence;
        newRaider.dodge = ownedRaiders[i].dodge;
        newRaider.sneak = ownedRaiders[i].sneak;
        parsedRaiders[ownedRaiders[i].slot-1] = newRaider;
    }

    return {
        props: {
            raiders: JSON.parse(JSON.stringify(raiders)),
            user: JSON.parse(JSON.stringify(user)),
            ownedRaiders: JSON.parse(JSON.stringify(parsedRaiders))
        }
    }
}

export default Stable;