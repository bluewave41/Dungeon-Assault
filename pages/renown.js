import { useEffect, useState } from 'react';
import axios from 'axios';
import Grid from '@material-ui/core/Grid';
import Table from '@material-ui/core/Table';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableCell from '@material-ui/core/TableCell';
import TableRow from '@material-ui/core/TableRow';
import TableBody from '@material-ui/core/TableBody';
import Paper from '@material-ui/core/Paper';
import Container from '@material-ui/core/Container';
import RenownTableEntry from 'components/renown/RenownTableEntry';
import Button from '@material-ui/core/Button';
import Backdrop from '@material-ui/core/Backdrop';
import { makeStyles } from '@material-ui/core/styles';
import PrepareRaidPanel from 'components/panels/PrepareRaidPanel';
import Stable from 'models/Stable';

const useStyles = makeStyles((theme) => ({
    backdrop: {
        zIndex: theme.zIndex.drawer + 1,
        color: '#fff',
    },
}));

const Renown = (props) => {
    const [renownTable, setRenownTable] = useState(null);
    const [shouldRender, setShouldRender] = useState(false);
    const [selectedIndex, setSelectedIndex] = useState(-1);
    const [showBackdrop, setShowBackdrop] = useState(false);
    const [raiders] = useState(props.raiders);
    const classes = useStyles();

    const onCancel = () => {
        setShowBackdrop(false);
    }

    const onSelectRaiders = (e) => {
        setShowBackdrop(true);
    }

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
        <Container>
            <Grid
                container
                spacing={0}
                direction="column"
                alignItems="center"
                justify="center"
            >
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell align="center">Rank</TableCell>
                                <TableCell align="center">Name</TableCell>
                                <TableCell align="center">Renown</TableCell>
                                <TableCell align="center">Last Raided</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {renownTable.map((el, index) => {
                                return <RenownTableEntry entry={el} index={index} selected={index == selectedIndex} onSelectEntry={setSelectedIndex}/>
                            })}
                        </TableBody>
                    </Table>
                </TableContainer>
                <Button onClick={onSelectRaiders} variant="contained" color="primary" disabled={selectedIndex == -1}>Raid</Button>
                {showBackdrop &&
                    <Backdrop className={classes.backdrop} open={showBackdrop}>
                        <PrepareRaidPanel raiders={raiders} onCancel={onCancel} target={renownTable[selectedIndex]} />
                    </Backdrop>}
            </Grid>
        </Container>
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;

    const raiders = await Stable.getRaiders(req.session.user.userId);

    return {
        props: {
            raiders: JSON.parse(JSON.stringify(raiders))
        }
    }
}

export default Renown;