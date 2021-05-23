import styles from './RaiderPreviewPanel.module.css';
import RaiderIcon from './RaiderIcon';
import StatPanel from './StatPanel';

const RaiderPreviewPanel = (props) => {
    return (
        <div className={styles.container}>
            <div className={styles.leftCol}>
                <RaiderIcon raider={props.selectedRaider} large={true} />
            </div>
            <div className={styles.rightCol}>
                <StatPanel selectedRaider={props.selectedRaider} />
            </div>
        </div>
    )
}

RaiderPreviewPanel.defaultProps = {
    raider: {
        attack: 0,
        defence: 0,
        dodge: 0,
        sneak: 0
    }
}

export default RaiderPreviewPanel;