import { applySession } from 'next-session';
import Raider from 'models/Raider';
import User from 'models/User';
import StablePanel from 'components/stable/StablePanel';

const Stable = (props) => {
    return (
        <StablePanel raiders={props.raiders} user={props.user} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);
    console.log(req.session)

    const raiders = await Raider.query();
    const user = await User.query().select('gold')
        .findOne('userId', req.session.user.userId);

    return {
        props: {
            raiders: JSON.parse(JSON.stringify(raiders)),
            user: JSON.parse(JSON.stringify(user))
        }
    }
}

export default Stable;