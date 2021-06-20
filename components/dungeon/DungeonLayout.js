import { useState } from 'react';
import Square from './Square';

const Row = (props) => {
    return (
        <div>
            <Square tile={props.tiles[0]} index={props.index} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[1]} index={props.index+1} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[2]} index={props.index+2} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[3]} index={props.index+3} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[4]} index={props.index+4} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[5]} index={props.index+5} onTrapChange={props.onTrapChange} />
            <Square tile={props.tiles[6]} index={props.index+6} onTrapChange={props.onTrapChange} />
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