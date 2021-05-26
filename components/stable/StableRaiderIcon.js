import { useState } from 'react';

const StableRaiderIcon = (props) => {
    const [id] = useState(props.id);

    const onClick = (e) => {
        //if there's already a raider there, select it
        if(props.raider) {
            props.onHighlightRaider(id);
        }
        //if no raider selected, add it
        else {
            props.onPurchaseRaider(id);
        }
    }

    let attributes = {
        large: props.large,
        onClick: onClick
    }

    if(!props.raider || !props.raider.name) {
        return <img {...attributes} src="/raiders/empty.png" />
    }

    if(props.large) {
        return <img {...attributes} src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
    else {
        return <img {...attributes} className={styles.sprite} src={`/raiders/${props.raoder.name.replace(/\s+/, '').toLowerCase()}.png`} />
    }
}

export default StableRaiderIcon;