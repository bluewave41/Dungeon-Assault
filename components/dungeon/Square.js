import styles from './Square.module.css';
import TileMap from 'lib/TileMap';

const Square = (props) => {
    const onClick = (e) => {
        props.onTrapChange(props.index);
    }

    if(props.index == 0 || props.index == 6 || props.index == 42 || props.index == 48) {
        return (
            <div className={styles.square}>
                <img className={styles.path} src='tiles/corner.png' />
                <img className={styles.path} src={`/squares/${props.tile.movement}.png`} />
            </div>
        )
    }
    if(props.index == 24) {
        return (
            <div className={styles.square}>
                <img className={styles.path} src='tiles/hoard.png' />
                <img className={styles.path} src={`/squares/${props.tile.movement}.png`} />
            </div>
        )
    }

    const tile = TileMap[props.tile.trapId];

    return (
        <div className={styles.square} onClick={onClick}>
            <img className={styles.path} src={tile} />
            <img className={styles.path} src={`/squares/${props.tile.movement}.png`} />
        </div>
    )
}

export default Square;