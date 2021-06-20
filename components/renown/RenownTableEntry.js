import TableRow from '@material-ui/core/TableRow';
import TableCell from '@material-ui/core/TableCell';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    selected: {
        color: "orange"
    }
})

const RenownTableEntry = (props) => {
    console.log(props);
    const classes = useStyles();

    const onSelectEntry = () => {
        props.onSelectEntry(props.index);
    }

    return (
        <TableRow selected={props.selected} onClick={onSelectEntry}>
            <TableCell align="center">{props.index+1}</TableCell>
            <TableCell align="center">{props.entry.username}</TableCell>
            <TableCell align="center">{props.entry.renown}</TableCell>
        </TableRow>
    )
}

export default RenownTableEntry;