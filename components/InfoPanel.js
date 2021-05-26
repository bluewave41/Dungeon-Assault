import styles from './InfoPanel.module.css';
import RaiderIcon from './RaiderIcon';

const InfoPanel = (props) => {
    return (
        <div id={styles.infoPanel}>
            <div className={styles.leftCol}>
                <RaiderIcon raider={props.raider} />
            </div>
            <div className={styles.rightCol}>
                <div>{props.raider.name}</div>
                <div>{props.raider.description}</div>
                <div>{props.raider.cost}</div>
                <div>
                    {props.raider.attack}<img src="/stats/attack.png" />
                    {props.raider.defence}<img src="/stats/defence.png" />
                    {props.raider.dodge}<img src="/stats/dodge.png" />
                    {props.raider.sneak}<img src="/stats/sneak.png" />
                </div>
                <div>
                    {props.raider.gold}<img src="/gold.png" />
                </div>
            </div>
        </div>
    )
}

export default InfoPanel;