import styles from './RaiderIcon.module.css';

const RaiderIcon = (props) => {
    if(!props.raider || !props.raider.name) {
        return <img src="/raiders/empty.png" />
    }
    if(props.large) {
        return <img src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
    else {
        return <img className={styles.raider} src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
}

export default RaiderIcon;