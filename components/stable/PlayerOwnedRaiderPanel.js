import styles from './PlayerOwnedRaiderPanel.module.css';
import StableRaiderIcon from './StableRaiderIcon';

const PlayerOwnedRaiderPanel = (props) => {
    console.log(props.raiders);
    const onPurchaseRaider = (id) => {
        props.onPurchaseRaider(id);
    }

    const onSelectPurchasedRaider = (id) => {
        props.onSelectPurchasedRaider(id);
    }

    return (
        <div>
            <div id={styles.raiders}>
                <StableRaiderIcon id="0" raider={props.raiders[0]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="1" raider={props.raiders[1]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="2" raider={props.raiders[2]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="3" raider={props.raiders[3]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="4" raider={props.raiders[4]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="5" raider={props.raiders[5]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="6" raider={props.raiders[6]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
                <StableRaiderIcon id="7" raider={props.raiders[7]} onPurchaseRaider={onPurchaseRaider} onSelectPurchasedRaider={onSelectPurchasedRaider} />
            </div>
        </div>
    )
}

export default PlayerOwnedRaiderPanel;