import RaiderIcon from './RaiderIcon';
import styles from './PurchasableRaider.module.css';

const PurchasableRaider = (props) => {
    const onClick = (e) => {
        props.onSelectRaider(props.raider);
    }

    return (
        <div className={styles.raiderRow} onClick={onClick}>
            <h5>{props.raider.name}</h5>
            <div className={styles.raider}>
                <div className={styles.leftCol}>
                    <RaiderIcon raider={props.raider} />
                </div>
                <div className={styles.rightCol}>
                    <div>{props.raider.treasure}</div>
                    <div className={styles.stats}>
                        <div><img src="/stats/attack.png" />{props.raider.attack}</div>
                        <div><img src="/stats/defence.png" />{props.raider.defence}</div>
                        <div><img src="/stats/dodge.png" />{props.raider.dodge}</div>
                        <div><img src="/stats/sneak.png" />{props.raider.sneak}</div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default PurchasableRaider;