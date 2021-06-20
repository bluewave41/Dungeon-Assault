import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    raider: {
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        width: "147px",
        height: "147px",
        margin: "0",
        cursor: "pointer"
    }
})

const Icon = (props) => {
    const styles = useStyles();

    const onClick = () => {
        if(props.clickable) {
            props.onSelectRaider(props.raider.slot);
        }
    }

    if(!props.raider?.name) {
        return <img src="/raiders/empty.png" />
    }
    return <img className={styles.raider} src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} onClick={onClick}/>
}

export default Icon;