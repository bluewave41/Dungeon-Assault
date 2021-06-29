import { useState } from 'react';
import Icon from 'components/Icon';
import axios from 'axios';

const SelectedRaidersPanel = (props) => {
    const [selectedSlot, setSelectedSlot] = useState(null);

    const onSelectRaider = async (slot) => {
        const response = await axios.post('/api/raid/selectRaider', { slot: slot });
        if(response.status == 200) {
            setSelectedSlot(slot);
        }
    }

    let raiders = [];
    for(var i=0;i<4;i++) {
        raiders.push(<Icon width="72px"
                           height="72px"
                           raider={props.raiders[i]}
                           clickable
                           onClick={onSelectRaider}
                           glow={props.raiders[i].slot == selectedSlot}
                    />);
    }

    return (
        <div style={{ display: 'flex' }}>
            {raiders}
        </div>
    )
}

export default SelectedRaidersPanel;