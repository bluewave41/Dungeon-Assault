import { useState } from 'react';
import styles from './StablePanel.module.css';
import PurchaseRaiderPanel from './PurchaseRaiderPanel';
import PlayerOwnedRaiderPanel from './PlayerOwnedRaiderPanel';
import InfoPanel from './InfoPanel';
import RaiderPreviewPanel from './RaiderPreviewPanel';
import TopBar from './TopBar';

/*2 column layout with raiders on left and stable on right*/

const Stable = (props) => {
    const [selectedRaider, setSelectedRaider] = useState({});

    const onSelectRaider = (raider) => {
        setSelectedRaider(raider);
    }

    return (
        <div>
            <TopBar />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchaseRaiderPanel raiders={props.raiders} onSelectRaider={onSelectRaider} />
                </div>
                <div className={styles.rightCol}>
                    <PlayerOwnedRaiderPanel />
                    <RaiderPreviewPanel selectedRaider={selectedRaider}/>
                </div>
            </div>
        </div>

    )
}

export default Stable;