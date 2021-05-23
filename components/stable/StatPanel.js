import styles from './StatPanel.module.css';
import StatBar from 'components/StatBar';

const StatPanel = (props) => {
    return (
        <div id={styles.stats}>
            <div><img src="/stats/attack.png" /><StatBar color="red" percent={props.selectedRaider.attack} /></div>
            <div><img src="/stats/defence.png" /><StatBar color="green" percent={props.selectedRaider.defence} /></div>
            <div><img src="/stats/dodge.png" /><StatBar color="forestgreen" percent={props.selectedRaider.dodge} /></div>
            <div><img src="/stats/sneak.png" /><StatBar color="blue" percent={props.selectedRaider.sneak} /></div>
        </div>
    )
}

export default StatPanel;