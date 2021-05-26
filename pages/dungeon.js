import { applySession } from 'next-session';
import Trap from 'models/Trap';
import DungeonPanel from 'components/dungeon/DungeonPanel';

const Dungeon = (props) => {
    return (
        <DungeonPanel traps={props.traps} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);

    const traps = await Trap.query();

    return {
        props: {
            traps: JSON.parse(JSON.stringify(traps))
        }
    }
}

export default Dungeon;