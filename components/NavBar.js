import { useState } from 'react';
import AppBar from '@material-ui/core/AppBar';
import ToolBar from '@material-ui/core/Toolbar';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Typography from '@material-ui/core/Typography';
import AccountCircle from '@material-ui/icons/AccountCircle';
import IconButton from '@material-ui/core/IconButton';
import { makeStyles } from '@material-ui/core/styles';
import Link from 'next/link';

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

const NavBar = (props) => {
    const [value, setValue] = useState(0);
    const classes = useStyles();
    
    const handleChange = (event, newValue) => {
        setValue(newValue);
    }

    const tabs = [
        { label: 'Login', href: '/login', showIfLoggedIn: false },
        { label: 'Register', href: '/register', showIfLoggedIn: false },

        { label: 'Dungeon', href: '/dungeon', showIfLoggedIn: true },
        { label: 'Stable', href: '/stable', showIfLoggedIn: true },
        { label: 'Renown Table', href: '/renown', showIfLoggedIn: true },
        { label: 'Logout', href: '/logout', showIfLoggedIn: true },
    ]
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
                        {tabs.map(el => {
                            if(props.username && !el.showIfLoggedIn) {
                                return;
                            }
                            return (
                                <Link href={el.href}>
                                    <Tab
                                        label={el.label}
                                    />
                                </Link>
                            )
                        })}
                    </Tabs>
                    <IconButton
                        aria-label="account of current user"
                        aria-controls="menu-appbar"
                        color="inherit"
                    >
                        <AccountCircle />
                    </IconButton>
                {props.username}
                </ToolBar>
            </AppBar>
        </div>
    )
}

export default NavBar;