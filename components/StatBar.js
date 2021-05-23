import styles from './StatBar.module.css';

const StatBar = (props) => {
    const percent = props.percent * 10;
    return (
        <div className={styles.bar}
             style={{ background: `linear-gradient(to right, ${props.color} ${percent}%, white ${percent}%)` }}></div>
    )
}

export default StatBar;