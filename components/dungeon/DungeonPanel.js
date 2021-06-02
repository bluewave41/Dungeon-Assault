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
    const [oldPlacedTraps] = useState(props.placedTraps.map(el => el.slice()));
    const [goldToShow, setGoldToShow] = useState(props.user.gold);
    const [placedTraps, setPlacedTraps] = useState(props.placedTraps);

    const onSelectTrap = (trap) => {
        setSelectedTrap(trap);
    }

    const onConfirmClick = async (e) => {
        const response = await axios.post('/api/dungeon/update', { newDungeon: placedTraps });
        if(response.ok) {
            console.log('good');
        }
        else {
            console.log(response.error);
        }
    }

    const onTrapChange = (squareId) => {
        if(squareId == 1 || squareId == 7 || squareId == 25 || squareId == 43 || squareId == 49) {
            return;
        }
        squareId = squareId-1;
        let copy = placedTraps.map(el => el.slice());
        let col = Math.floor(squareId/7);
        let index = squareId%7;
        copy[col][index] = selectedTrap.id;

        let difference = 0;

        if(oldPlacedTraps[col][index] != 0) { //overwriting a trap
            //give back half the cost
            let trap = props.traps.find(el => el.id == selectedTrap.id);
            difference += Math.floor(trap.treasure/2);
            difference -= selectedTrap.treasure;
            setGoldToShow(goldToShow + difference);
        }
        else {
            setGoldToShow(goldToShow - selectedTrap.treasure);
        }
        setPlacedTraps(copy);
    }

    return (
        <div>
            <TopBar onConfirmClick={onConfirmClick} />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchasePanel type={PurchasableTrap} items={props.traps} onSelectItem={onSelectTrap} />
                </div>
                <div className={styles.rightCol}>
                    <DungeonLayout seeds={props.seeds} placedTraps={placedTraps} onTrapChange={onTrapChange} />
                    <PreviewPanel type="trap" item={selectedTrap} goldToShow={goldToShow} />
                </div>
            </div>
        </div>

    )
}

export default Dungeon;