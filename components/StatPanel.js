import styles from './StatPanel.module.css';
import StatBar from 'components/StatBar';

const StatPanel = (props) => {
    if(props.type == "trap") {
        return (
            <div id={styles.stats}>
                <div><img src="/stats/attack.png" /><StatBar color="red" percent={props.item.attack} /></div>
                <div><img src="/stats/defence.png" /><StatBar color="green" percent={props.item.defence} /></div>
                <div><img src="/stats/snare.png" /><StatBar color="forestgreen" percent={props.item.snare} /></div>
                <div><img src="/stats/detect.png" /><StatBar color="blue" percent={props.item.detect} /></div>
            </div>
        )
    }
    else {
        return (
            <div id={styles.stats}>
                <div><img src="/stats/attack.png" /><StatBar color="red" percent={props.item.attack} /></div>
                <div><img src="/stats/defence.png" /><StatBar color="green" percent={props.item.defence} /></div>
                <div><img src="/stats/dodge.png" /><StatBar color="forestgreen" percent={props.item.dodge} /></div>
                <div><img src="/stats/sneak.png" /><StatBar color="blue" percent={props.item.sneak} /></div>
            </div>
        )
    }
}

export default StatPanel;