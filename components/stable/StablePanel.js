import { useState } from 'react';
import styles from './StablePanel.module.css';
import PurchasePanel from '../PurchasePanel';
import PlayerOwnedRaiderPanel from './PlayerOwnedRaiderPanel';
import PreviewPanel from '../PreviewPanel';
import TopBar from '../TopBar';
import PurchasableRaider from './PurchasableRaider';

const Stable = (props) => {
    const [raiderList, setRaiderList] = useState([]);
    const [selectedRaider, setSelectedRaider] = useState({});
    const [goldToShow, setGoldToShow] = useState(props.user.gold);
    const [selectedId, setSelectedId] = useState(null);

    const onSelectRaider = (raider) => {
        setSelectedId(null);
        setSelectedRaider(raider);
    }

    const onHighlightRaider = (id) => {
        setSelectedId(id);
        setSelectedRaider(raiderList[id]);
    }

    const onDismissRaider = () => {
        let copy = [...raiderList];
        copy[selectedId] = null;
        setRaiderList(copy);
        //TODO: differentiate between whether raider was bought this session or was already confirmed
    }

    const onSelectSquare = (id) => {
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
            <TopBar />
            <div className={styles.container}>
                <div className={styles.leftCol}>
                    <PurchasePanel type={PurchasableRaider} items={props.raiders} onSelectItem={onSelectRaider} />
                </div>
                <div className={styles.rightCol}>
                    <PlayerOwnedRaiderPanel raiders={raiderList} onSelectSquare={onSelectSquare} onHighlightRaider={onHighlightRaider} />
                    <PreviewPanel type="raider"
                                  item={selectedRaider}
                                  goldToShow={goldToShow}
                                  showDismiss={selectedId != null}
                                  onDismissRaider={onDismissRaider}
                    />
                </div>
            </div>
        </div>
    )
}

export default Stable;