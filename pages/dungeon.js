import { applySession } from 'next-session';
import Trap from 'models/Trap';
import DungeonTiles from 'models/DungeonTiles';
import DungeonPanel from 'components/dungeon/DungeonPanel';
import UserModel from 'models/User';

const Dungeon = (props) => {
    return (
        <DungeonPanel traps={props.traps} tiles={props.tiles} user={props.user} />
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    await applySession(req, res);

    const user = await UserModel.query().select('gold')
        .findOne('userId', req.session.user.userId);

    const tiles = await DungeonTiles.query().select('tile', 'movement', 'trapId')
        .where('userId', req.session.user.userId);
        
    const traps = await Trap.query();

    return {
        props: {
            user: JSON.parse(JSON.stringify(user)),
            traps: JSON.parse(JSON.stringify(traps)),
            tiles: JSON.parse(JSON.stringify(tiles))
        }
    }
}

export default Dungeon;