import styles from './TopBar.module.css';

const TopBar = (props) => {
    return (
        <div className={styles.container}>
            <div className={styles.row}>
                Test
            </div>
            <div className={styles.row}>
                Test2
            </div>
            <div className={styles.row}>
                Test3
            </div>
        </div>
    )
}

export default TopBar;