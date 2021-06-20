import OwnedRaidersPanel from 'components/OwnedRaidersPanel';
import ChosenRaidersPanel from 'components/renown/ChosenRaidersPanel';
import Button from '@material-ui/core/Button';
import { useState } from 'react';

const PrepareRaidPanel = (props) => {
    const [selectedRaiders, setSelectedRaiders] = useState([]);

    const onSelectRaider = (slot) => {
        //disallow selected more than 4 raiders or the same raider twice
        if(selectedRaiders.includes(slot) || selectedRaiders.length == 4) {
            return;
        }
        let copy = [...selectedRaiders];
        copy.push(slot);
        setSelectedRaiders(copy);
        console.log(selectedRaiders.map(slot => props.raiders.find(el => el.slot == slot)));
    }

    return (
        <div>
            <OwnedRaidersPanel raiders={props.raiders} onSelectRaider={onSelectRaider} />
            <hr />
            <ChosenRaidersPanel raiders={selectedRaiders.map(slot => props.raiders.find(el => el.slot == slot))} />
            <Button variant="contained" color="primary" disabled={selectedRaiders.length < 4 ? true : false}>Begin</Button>
            <Button variant="contained" color="secondary" onClick={props.onCancel}>Cancel</Button>
        </div>
    )
}

export default PrepareRaidPanel;