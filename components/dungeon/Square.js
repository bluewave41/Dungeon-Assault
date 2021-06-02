import styles from './Square.module.css';
import TileMap from 'lib/TileMap';

const Square = (props) => {
    const onClick = (e) => {
        props.onTrapChange(props.id);
    }

    let imgId = 0;
    let tile = '';
	if(props.state.up) {
		imgId += 1;
	}
	if(props.state.left) {
		imgId += 2;
	}
	if(props.state.right) {
		imgId += 4;
	}
	if(props.state.down) {
		imgId += 8;
	}

    tile = TileMap[props.placedTrap];

    if(props.state) {
        return (
            <div className={styles.square} onClick={onClick}>
                <img className={styles.path} src={tile} />
                <img className={styles.path} src={`/squares/${imgId}.png`} />
            </div>
        )
    }
    else {
        return (
            <div className={styles.square}>
    
            </div>
        )
    }
}

export default Square;