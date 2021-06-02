import styles from './TopBar.module.css';

const TopBar = (props) => {
    const onConfirmClick = () => {
        props.onConfirmClick();
    }

    return (
        <div className={styles.container}>
            <div className={styles.row}>
                <button onClick={onConfirmClick}>Confirm</button>
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