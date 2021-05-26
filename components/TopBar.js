import styles from './TopBar.module.css';

const TopBar = (props) => {
    return (
        <div className={styles.container}>
            <div className={styles.row}>
                <button>Confirm</button>
            </div>
            <div className={styles.row}>
                Test2
            </div>
            <div className={styles.row}>
                <button>Cancel</button>
            </div>
        </div>
    )
}

export default TopBar;