import Dungeon from 'components/raid/Dungeon';

const Raid = (props) => {
    return <Dungeon />
}

export async function getServerSideProps(context) {
    const { req, res } = context;

    return {
        props: {}
    }
}

export default Raid;