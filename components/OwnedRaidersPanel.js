import Grid from '@material-ui/core/Grid';
import Icon from 'components/Icon';
import Box from '@material-ui/core/Box';

const OwnedRaidersPanel = (props) => {
    const onSelectRaider = (slot) => {
        props.onSelectRaider(slot);
    }

    let squares = [];
    for(var i=0;i<8;i++) {
        squares.push(
            <Grid item xs={3}>
                <Box display="flex" justifyContent="center">
                    <Icon raider={props.raiders[i]} clickable={props.raiders[i] ? true : false} onClick={onSelectRaider}/>
                </Box>
            </Grid>
        )
    }
    return (
        <Grid container>
            {squares}
        </Grid>
    )
}

export default OwnedRaidersPanel;