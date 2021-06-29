import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles(theme => ({
    raider: props => ({
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        width: props.width ? props.width : '147px',
        height: props.height ? props.height : '147px',
        margin: "0",
        cursor: props.clickable ? "pointer" : '',
    }),
    glow: {
        boxShadow: '0 0 30px yellow',
    }
}));

const Icon = (props) => {
    const styles = useStyles({ width: props.width, height: props.height });

    const onClick = () => {
        if(props.clickable) {
            props.onClick(props.raider.slot);
        }
    }

    if(!props.raider?.name) {
        return <img className={styles.raider} src="/raiders/empty.png" />
    }
    return <img className={`${styles.raider} ${props.glow ? styles.glow : ''}`} src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} onClick={onClick}/>
}

export default Icon;