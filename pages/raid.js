import Dungeon from 'components/raid/Dungeon';
import SelectedRaidersPanel from 'components/raid/SelectedRaidersPanel';
import RaidStatus from 'models/RaidStatus';
import Stable from 'models/Stable';

const Raid = (props) => {
    return (
        <div>
            <Dungeon />
            <SelectedRaidersPanel raiders={props.raiders} />
        </div>
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;

    //TODO: is logged in

    const slots = await RaidStatus.query().select('raider1', 'raider2', 'raider3', 'raider4')
        .findOne('userId', req.session.user.userId);

    const raiders = await Stable.query().select()
        .withGraphFetched('information')
        .where('userId', req.session.user.userId)
        .whereIn('slot', Object.values(slots));

    raiders.forEach(el => {
        Object.assign(el, el.information);
        delete el['information'];
    })

    //get the selected raider IDs

    return {
        props: {
            raiders: JSON.parse(JSON.stringify(raiders))
        }
    }
}

export default Raid;