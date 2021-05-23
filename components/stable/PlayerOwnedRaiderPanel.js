import styles from './PlayerOwnedRaiderPanel.module.css';
import RaiderIcon from './RaiderIcon';

const PlayerOwnedRaiderPanel = (props) => {
    return (
        <div>
            <div id={styles.raiders}>
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
                <RaiderIcon />
            </div>
        </div>
    )
}

export default PlayerOwnedRaiderPanel;