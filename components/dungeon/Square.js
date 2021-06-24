import styles from './Square.module.css';
import TileMap from 'lib/TileMap';

const Square = (props) => {
    const onClick = (e) => {
        props.onTrapChange(props.index);
    }

    let tile;

    if(props.index == 0 || props.index == 6 || props.index == 42 || props.index == 48) { //corner tile
        tile = 'tiles/corner.png';
    }
    else if(props.index == 24) { //center tile
        tile = 'tiles/hoard.png';
    }
    else if(props.locked) {
        tile = 'tiles/locked.png';
    }
    else if(!props.tile) {
        tile = 'tiles/empty.png';
    }
    else {
        tile = TileMap[props.tile.trapId];
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
            <div className={styles.square} onClick={onClick}>
                <img className={styles.path} src={tile} />
            </div>
        )
    }
}

export default Square;