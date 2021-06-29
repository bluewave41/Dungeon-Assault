import Square from 'components/dungeon/Square';
import { useState, useEffect } from 'react';
import axios from 'axios';

const Row = (props) => {
    let tiles = [];
    for(var i=0;i<7;i++) {
        tiles.push(<Square index={props.index + i} 
                           trapId={props.dungeon[props.index + i].trapId}
                           onClick={props.onClick} 
                           occupied={props.occupied == props.index + i} 
                           movable={props.dungeon[props.index + i].movable}
                   />);
    }
    return (
        <div style={{ display: "flex" }}>
            {tiles}
        </div>
    )
}

const Dungeon = (props) => {
    let squares = [];
    const [occupiedSquare, setOccupiedSquare] = useState(null); //square player is on
    const [dungeon, setDungeon] = useState(null);
    const [shouldRender, setShouldRender] = useState(false);

    useEffect(function() {
        //initialize dungeon
        let d = [];
        for(var i=0;i<49;i++) {
            d.push({ movable: false, trapId: -1 });
        }

        setDungeon(d);
        setShouldRender(true);
    }, []);

    if(!shouldRender) {
        return null;
    }

    const onSelectSquare = async (tileId) => {
        if(!occupiedSquare) { //first click
            let response = await axios.post('/api/raid/selectStart', { tile: tileId });
            if(response.status == 200) {
                setOccupiedSquare(tileId);
                response = await axios.post('/api/raid/getMovableTiles');
                if(response.status == 200) {
                    let dungeonCopy = [...dungeon];
                    for(var i=0;i<response.data.tiles.length;i++) {
                        dungeonCopy[response.data.tiles[i]].movable = true;
                    }
                    console.log(dungeonCopy)
                    setDungeon(dungeonCopy);
                }
            }
        }
        //moving tile
        if(dungeon[tileId].movable) {
            let response = await axios.post('/api/raid/moveTile', { tile: tileId }); //sends back tile id and trap there
            if(response.status == 200) {
                setOccupiedSquare(tileId);

                let dungeonCopy = [...dungeon];
                for(var i=0;i<response.data.movable.length;i++) {
                    dungeonCopy[response.data.movable[i]].movable = true;
                }
                dungeonCopy[response.data.tileId].trapId = response.data.trapId;
                setDungeon(dungeonCopy);
            }
        }
    }

    for(var i=0;i<49;i+=7) {
        squares.push(<Row index={i} onClick={onSelectSquare} occupied={occupiedSquare} dungeon={dungeon}/>);
    }
    return (
        <div>
            {squares}
        </div>
    )
}

export default Dungeon;