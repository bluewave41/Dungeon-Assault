import Square from './Square';

const Row = (props) => {
    let tiles = [];
    for(var i=0;i<7;i++) {
        tiles.push(<Square tile={props.tiles[i]} index={props.index+i} onTrapChange={props.onTrapChange} showPath/>);
    }
    return (
        <div>
            {tiles}
        </div>
    )
}

const DungeonLayout = (props) => {
    const onTrapChange = (tileId) => {
        props.onTrapChange(tileId);
    }

    let squares = [];
    for(var i=0;i<49;i+=7) {
        squares.push(
            <Row tiles={props.tiles.slice(i, i+7)} index={i} onTrapChange={onTrapChange} />
        )
    }

    return (
        <div>
            {squares}
        </div>
    )
}

export default DungeonLayout;