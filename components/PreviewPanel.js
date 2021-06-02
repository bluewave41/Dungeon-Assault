import styles from './PreviewPanel.module.css';
import StatPanel from './StatPanel';
import Sprite from './Sprite';

const PreviewPanel = (props) => {

    return (
        <div className={styles.container}>
            <div className={styles.leftCol}>
                <Sprite type={props.type} item={props.item} large/>
            </div>
            <div className={styles.middleCol}>
                <StatPanel type={props.type} item={props.item} />
            </div>
            <div className={styles.rightCol}>
                <div>Gold: {props.goldToShow}</div>
                <div>Cost: {props.item.treasure}</div>
            </div>
        </div>
    )
}

PreviewPanel.defaultProps = {
    raider: {
        attack: 0,
        defence: 0,
        dodge: 0,
        sneak: 0
    },
    trap: {
        attack: 0,
        defence: 0,
        snare: 0,
        detect: 0
    }
}

export default PreviewPanel;