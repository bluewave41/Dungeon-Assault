import { useState } from 'react';

const StableRaiderIcon = (props) => {
    const [id] = useState(props.id);

    const onClick = (e) => {
        //if there's already a raider there, select it
        if(props.raider) {
            props.onSelectPurchasedRaider(id);
        }
        //if no raider selected, add it
        else {
            props.onPurchaseRaider(id);
        }
    }

    if(!props.raider || !props.raider.name) {
        return <img onClick={onClick} src="/raiders/empty.png" />
    }

    return <img onClick={onClick} src={`/raiders/${props.raider.name.replace(/\s+/, '').toLowerCase()}.png`} />
}

export default StableRaiderIcon;