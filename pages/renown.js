import { useEffect, useState } from 'react';
import axios from 'axios';

const Renown = (props) => {
    const [renownTable, setRenownTable] = useState(null);
    const [shouldRender, setShouldRender] = useState(false);

    useEffect(() => {
        const getTable = async () => {
            const response = await axios.get('/api/renown/get');
            if(response.status == 200) {
                setRenownTable(response.data);
                setShouldRender(true);
            }
        }
        getTable();
    }, []);

    if(!shouldRender) {
        return null;
    }

    return (
        <div>
            <table>
                <tr>
                    <th>Rank</th>
                    <th>Name</th>
                    <th>Renown</th>
                    <th>Last Raided</th>
                </tr>
                {renownTable.map((el, index) => (
                    <tr>
                        <td>{index+1}</td>
                        <td>{el.username}</td>
                        <td>{el.renown}</td>
                    </tr>
                ))}
            </table>
        </div>
    )
}

export default Renown;