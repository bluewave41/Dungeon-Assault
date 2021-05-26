import { useState } from 'react';
import styles from './Sprite.module.css';

const Sprite = (props) => {
    const [id] = useState(props.id);

    const onClick = (e) => {
        props.onClick(id);
    }

    let attributes = {
        clickable: props.clickable,
        type: props.type,
        large: props.large,
        onClick: props.clickable ? onClick : null
    }

    let fixedType = props.type + 's';

    if(!props.item || !props.item.name) {
        return <img {...attributes} src="/raiders/empty.png" />
    }

    if(props.large) {
        return <img {...attributes} src={`/${fixedType}/${props.item.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
    else {
        return <img {...attributes} className={styles.sprite} src={`/${fixedType}/${props.item.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
}

export default Sprite;