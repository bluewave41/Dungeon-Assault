import styles from './InfoPanel.module.css';

const InfoPanel = (props) => {
    return (
        <div id={styles.infoPanel}>
            <div className={styles.leftCol}>
                <props.type item={props.item} />
            </div>
            <div className={styles.rightCol}>
                <div>{props.item.name}</div>
                <div>{props.item.description}</div>
                <div>{props.item.cost}</div>
                <div>
                    {props.raider.attack}<img src="/stats/attack.png" />
                    {props.raider.defence}<img src="/stats/defence.png" />
                    {props.raider.dodge}<img src="/stats/dodge.png" />
                    {props.raider.sneak}<img src="/stats/sneak.png" />
                </div>
                <div>
                    {props.item.gold}<img src="/gold.png" />
                </div>
            </div>
        </div>
    )
}

export default InfoPanel;