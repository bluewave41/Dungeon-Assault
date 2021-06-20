import { useState } from 'react';
import styles from './StablePanel.module.css';
import PurchasePanel from '../PurchasePanel';
import PlayerOwnedRaiderPanel from './PlayerOwnedRaiderPanel';
import PreviewPanel from '../PreviewPanel';
import TopBar from '../TopBar';
import PurchasableRaider from './PurchasableRaider';
import axios from 'axios';

const Stable = (props) => {
    const [raiderList, setRaiderList] = useState(props.ownedRaiders);
    const [oldRaiderList] = useState([...props.ownedRaiders]);
    const [selectedRaider, setSelectedRaider] = useState({});
    const [goldToShow, setGoldToShow] = useState(props.user.gold);

    const onConfirmClick = async (e) => {
        const response = await axios.post('/api/stable/update', { newStable: raiderList });
        if(response.ok) {

        }
    }

    const onSelectRaider = (raider) => {
        setSelectedRaider(raider);
    }

    const onSelectPurchasedRaider = (id) => {
        setSelectedId(id);
        setSelectedRaider(raiderList[id]);
    }

    const onPurchaseRaider = (id) => {
        if(raiderList[id]) {
            return;
        }
        let copy = [...raiderList];
        copy[id] = selectedRaider;
        setRaiderList(copy);
        setGoldToShow(goldToShow - selectedRaider.treasure);
    }

    return (
        <div>
            <TopBar onConfirmClick={onConfirmClick} />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchasePanel type={PurchasableRaider} items={props.raiders} onSelectItem={onSelectRaider} />
                </div>
                <div className={styles.rightCol}>
                    <PlayerOwnedRaiderPanel raiders={raiderList} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                    <PreviewPanel type="raider"
                                  item={selectedRaider}
                                  goldToShow={goldToShow}
                    />
                </div>
            </div>
        </div>
    )
}

export default Stable;