import { useState } from 'react';
import styles from './DungeonPanel.module.css';
import TopBar from '../TopBar';
import PurchasePanel from '../PurchasePanel';
import PurchasableTrap from './PurchasableTrap';
import PreviewPanel from '../PreviewPanel';
import DungeonLayout from './DungeonLayout';
import axios from 'axios';

const Dungeon = (props) => {
    const [selectedTrap, setSelectedTrap] = useState({});
    const [tiles, setTiles] = useState(Array.from(props.tiles));
    const [oldTiles] = useState(JSON.parse(JSON.stringify(props.tiles)));
    const [goldToShow, setGoldToShow] = useState(props.user.gold);

    const onSelectTrap = (trap) => {
        setSelectedTrap(trap);
    }

    const onConfirmClick = async (e) => {
        let changes = [];
        for(var i=0;i<tiles.length;i++) {
            if(tiles[i].trapId != oldTiles[i].trapId) {
                changes.push(tiles[i]);
            }
        }
        const response = await axios.post('/api/dungeon/update', { changes: changes });
        if(response.ok) {
            console.log('good');
        }
        else {
            console.log(response.error);
        }
    }

    const onTrapChange = (squareId) => {
        let oldTile = oldTiles.find(el => el.tile == squareId);
        let copy = [...tiles];
        copy.find(el => el.tile == squareId).trapId = selectedTrap.trapId;

        if(oldTile.trapId) { //overwriting a trap
            let difference = Math.floor(selectedTrap.treasure/2);
            difference -= selectedTrap.treasure;
            setGoldToShow(goldToShow + difference);
        }
        else {
            setGoldToShow(goldToShow - selectedTrap.treasure);
        }
        setTiles(copy);
    }

    return (
        <div>
            <TopBar onConfirmClick={onConfirmClick} />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchasePanel type={PurchasableTrap} items={props.traps} onSelectItem={onSelectTrap} />
                </div>
                <div className={styles.rightCol}>
                    <DungeonLayout tiles={tiles} onTrapChange={onTrapChange} />
                    <PreviewPanel type="trap" item={selectedTrap} goldToShow={goldToShow} />
                </div>
            </div>
        </div>
    )
}

export default Dungeon;