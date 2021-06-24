import OwnedRaidersPanel from 'components/OwnedRaidersPanel';
import ChosenRaidersPanel from 'components/renown/ChosenRaidersPanel';
import Button from '@material-ui/core/Button';
import { useState } from 'react';
import { useRouter } from 'next/router';
import axios from 'axios';

const PrepareRaidPanel = (props) => {
    const router = useRouter();
    const [selectedRaiders, setSelectedRaiders] = useState([]);

    const onStart = async (e) => {
        const response = await axios.post('/api/raid/start', { raiders: selectedRaiders, target: props.target.username });
        if(response.status == 200) {
            router.push('/raid');
        }
    }

    const onSelectRaider = (slot) => {
        //disallow selected more than 4 raiders or the same raider twice
        if(selectedRaiders.includes(slot) || selectedRaiders.length == 4) {
            return;
        }
        let copy = [...selectedRaiders];
        copy.push(slot);
        setSelectedRaiders(copy);
    }

    return (
        <div>
            <OwnedRaidersPanel raiders={props.raiders} onSelectRaider={onSelectRaider} />
            <hr />
            <ChosenRaidersPanel raiders={selectedRaiders.map(slot => props.raiders.find(el => el.slot == slot))} />
            <Button variant="contained" color="primary" disabled={selectedRaiders.length < 4 ? true : false} onClick={onStart}>Begin</Button>
            <Button variant="contained" color="secondary" onClick={props.onCancel}>Cancel</Button>
        </div>
    )
}

export default PrepareRaidPanel;