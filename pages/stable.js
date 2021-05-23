import { applySession } from 'next-session';
import Raider from 'models/Raider';
import StablePanel from 'components/stable/StablePanel';

const Stable = (props) => {
    return (
        <StablePanel raiders={props.raiders} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);

    const raiders = await Raider.query();

    return {
        props: {
            raiders: JSON.parse(JSON.stringify(raiders))
        }
    }
}

export default Stable;