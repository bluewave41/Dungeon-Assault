import { applySession } from 'next-session';
import Trap from 'models/Trap';
import DungeonModel from 'models/Dungeon';
import DungeonPanel from 'components/dungeon/DungeonPanel';
import UserModel from 'models/User';

const Dungeon = (props) => {
    return (
        <DungeonPanel traps={props.traps} seeds={props.seeds} placedTraps={props.placedTraps} user={props.user} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);

    const user = await UserModel.query().select('gold')
        .findOne('userId', req.session.user.userId);
        
    const traps = await Trap.query();
    const dungeon = await DungeonModel.query().select()
        .findOne('userId', req.session.user.userId);

    return {
        props: {
            user: JSON.parse(JSON.stringify(user)),
            traps: JSON.parse(JSON.stringify(traps)),
            seeds: JSON.parse(JSON.stringify([dungeon.seed1, dungeon.seed2, dungeon.seed3])),
            placedTraps: dungeon.getPlacedTraps()
        }
    }
}

export default Dungeon;