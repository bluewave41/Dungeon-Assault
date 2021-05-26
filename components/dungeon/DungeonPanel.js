import { useState } from 'react';
import styles from './DungeonPanel.module.css';
import TopBar from '../TopBar';
import PurchasePanel from '../PurchasePanel';
import PurchasableTrap from './PurchasableTrap';
import PreviewPanel from '../PreviewPanel';

const Dungeon = (props) => {
    const [selectedTrap, setSelectedTrap] = useState({});

    const onSelectTrap = (trap) => {
        setSelectedTrap(trap);
    }

    return (
        <div>
            <TopBar />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchasePanel type={PurchasableTrap} items={props.traps} onSelectItem={onSelectTrap} />
                </div>
                <div className={styles.rightCol}>
                    <PreviewPanel type="trap" item={selectedTrap}/>
                </div>
            </div>
        </div>

    )
}

export default Dungeon;