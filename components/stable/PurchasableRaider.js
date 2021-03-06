import Sprite from '../Sprite';
import styles from './PurchasableRaider.module.css';

const PurchasableRaider = (props) => {
    const onClick = (e) => {
        props.onSelectItem(props.item);
    }

    return (
        <div className={styles.raiderRow} onClick={onClick}>
            <h5>{props.item.name}</h5>
            <div className={styles.raider}>
                <div className={styles.leftCol}>
                    <Sprite type="raider" item={props.item} />
                </div>
                <div className={styles.rightCol}>
                    <div>{props.item.treasure}</div>
                    <div className={styles.stats}>
                        <div><img src="/stats/attack.png" />{props.item.attack}</div>
                        <div><img src="/stats/defence.png" />{props.item.defence}</div>
                        <div><img src="/stats/dodge.png" />{props.item.dodge}</div>
                        <div><img src="/stats/sneak.png" />{props.item.sneak}</div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default PurchasableRaider;