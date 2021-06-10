import { useState } from 'react';
import AppBar from '@material-ui/core/AppBar';
import ToolBar from '@material-ui/core/Toolbar';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Box from '@material-ui/core/Box';
import Typography from '@material-ui/core/Typography';
import Grid from '@material-ui/core/Grid';
import LoginPanel from 'components/panels/LoginPanel';
import RegisterPanel from 'components/panels/RegisterPanel';
import AccountCircle from '@material-ui/icons/AccountCircle';
import IconButton from '@material-ui/core/IconButton';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    root: {
        display: "flex",
        flexDirection: "column",
        justifyContent: "center"
    },
    tabs: {
        flexGrow: 1
    }
});

const TabPanel = (props) => {
    const classes = useStyles();
    const { children, value, index, ...other } = props;
    return (
        <div
            role="tabpanel"
            hidden={value !== index}
        >
            <Grid
                container
                className={classes.root}
                spacing={0}
                alignItems="center"
                justify="center"
            >
                {value === index && (
                    <Box p={3}>
                        <Typography>{children}</Typography>
                    </Box>
                )}
            </Grid>
        </div>
    )
}
const LinkTab = (props) => {
    return (
        <Tab 
            component="a"
            onClick={(event) => {
                event.preventDefault()
            }}
            {...props}
        />
    )
}

const NavBar = (props) => {
    const [value, setValue] = useState(0);
    const classes = useStyles();
    
    const handleChange = (event, newValue) => {
        setValue(newValue);
    }
    return (
        <div>
            <AppBar position="sticky">
                <ToolBar>
                    <Typography variant="h6" className={classes.title}>
                        Dungeon Assault
                    </Typography>
                    <Tabs 
                        className={classes.tabs}
                        value={value}
                        onChange={handleChange}
                    >
                        <LinkTab label="Login" href="/login" />
                        <LinkTab label="Register" href="/register" />
                    </Tabs>
                    <IconButton
                        aria-label="account of current user"
                        aria-controls="menu-appbar"
                        color="inherit"
                    >
                <AccountCircle />
              </IconButton>
                </ToolBar>
            </AppBar>
            <TabPanel value={value} index={0}>
                <LoginPanel />
            </TabPanel>
            <TabPanel value={value} index={1}>
                <RegisterPanel />
            </TabPanel>
        </div>
    )
}

export default NavBar;