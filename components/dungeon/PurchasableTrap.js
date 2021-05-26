import Sprite from '../Sprite';
import styles from './PurchasableTrap.module.css';

const PurchasableTrap = (props) => {
    const onClick = (e) => {
        props.onSelectItem(props.item);
    }

    return (
        <div className={styles.trapRow} onClick={onClick}>
            <h5>{props.item.name}</h5>
            <div className={styles.raider}>
                <div className={styles.leftCol}>
                    <Sprite type="trap" item={props.item} />
                </div>
                <div className={styles.rightCol}>
                    <div>{props.item.treasure}</div>
                    <div className={styles.stats}>
                        <div><img src="/stats/attack.png" />{props.item.attack}</div>
                        <div><img src="/stats/defence.png" />{props.item.defence}</div>
                        <div><img src="/stats/snare.png" />{props.item.snare}</div>
                        <div><img src="/stats/detect.png" />{props.item.detect}</div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default PurchasableTrap;