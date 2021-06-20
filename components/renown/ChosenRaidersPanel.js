import Grid from '@material-ui/core/Grid';
import Icon from 'components/Icon';
import Box from '@material-ui/core/Box';

const ChosenRaidersPanel = (props) => {
    let squares = [];
    for(var i=0;i<4;i++) {
        squares.push(
            <Grid item xs={3}>
                <Box display="flex" justifyContent="center">
                    <Icon raider={props.raiders[i]} />
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

export default ChosenRaidersPanel;