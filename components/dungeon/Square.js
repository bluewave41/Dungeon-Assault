import TileMap from 'lib/TileMap';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    occupied: {
        boxShadow: '0 0 30px yellow'
    },
    square: {
        width: '50px',
        height: '50px',
        outline: '1px solid black',
        display: 'inline-block',
        position: 'relative',
        margin: "2px"
    },
    path: {
        position: 'absolute'
    },
    movable: {
        outline: "2px solid yellow"
    }
});

const Square = (props) => {
    const styles = useStyles();
    const onClick = (e) => {
        props.onClick(props.index);
    }

    let tile;

    if(props.index == 0 || props.index == 6 || props.index == 42 || props.index == 48) { //corner tile
        tile = 'tiles/corner.png';
    }
    else if(props.index == 24) { //center tile
        tile = 'tiles/hoard.png';
    }
    else if(props.tile) {
        tile = TileMap[props.tile.trapId];
    }
    else if(props.trapId == -1) {
        tile = 'tiles/locked.png';
    }
    else {
        tile = 'tiles/empty.png';
    }

    if(props.showPath) {
        return (
            <div className={styles.square} onClick={onClick}>
                <img className={styles.path} src={tile} />
                <img className={styles.path} src={`/squares/${props.tile.movement}.png`} />
            </div>
        )
    }
    else {
        return (
            <div className={`${styles.square} ${props.occupied ? styles.occupied: ''} ${props.movable ? styles.movable : ''}`} onClick={onClick}>
                <img className={styles.path} src={tile} />
            </div>
        )
    }
}

export default Square;