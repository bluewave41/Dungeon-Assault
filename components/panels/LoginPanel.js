import { useState } from 'react';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import axios from 'axios';
import { makeStyles } from '@material-ui/styles';

const useStyles = makeStyles({
    circle: {
        width: "16px",
        height: "16px",
        borderRadius: "50%",
        backgroundColor: props => props.loginStatus,
        display: "inline-block",
        marginLeft: "auto",
        alignSelf: "center",
    },
    card: {
        backgroundColor: '#333',
    },
    buttonContainer: {
        display: "flex",
        alignItems: "center"
    }
});

const LoginPanel = (props) => {
    const [usernameBox, setUsernameBox] = useState({
        value: '',
        error: false,
        helperText: ''
    });
    const [passwordBox, setPasswordBox] = useState({
        value: '',
        error: false,
        helperText: ''
    });

    const [loginStatus, setLoginStatus] = useState('');

    const classes = useStyles({loginStatus: loginStatus});

    const onChange = (e) => {
        let copy;
        if(e.target.name == 'username') {
            copy = { ...usernameBox };
            copy.value = e.target.value;
            setUsernameBox(copy);
        }
        else {
            copy = { ...passwordBox };
            copy.value = e.target.value;
            setPasswordBox(copy);
        }
    }

    const onSubmit = async(e) => {
        //reset boxes
        setUsernameBox({
            value: usernameBox.value,
            error: false,
            helperText: ''
        });
        setPasswordBox({
            value: passwordBox.value,
            error: false,
            helperText: ''
        });
        if(!usernameBox.value) {
            let copy = { ...usernameBox };
            copy.error = true;
            copy.helperText = "Field cannot be empty.";
            setUsernameBox(copy);
        }
        if(!passwordBox.value) {
            let copy = { ...passwordBox };
            copy.error = true;
            copy.helperText = "Field cannot be empty.";
            setPasswordBox(copy);
        }
        if(usernameBox.value && passwordBox.value) {
            try {
                const response = await axios.post('/api/auth/login', { username: usernameBox.value, password: passwordBox.value });
                setLoginStatus('green');
            }
            catch(error) {
                setLoginStatus('red');
            }
        }
    }

    return (
        <div>
            <Card>
                <CardContent>
                    <Typography variant="h4" align="center">Login</Typography>
                    <div>
                        <TextField
                            id="username"
                            label="Username"
                            variant="filled" 
                            name="username" 
                            onChange={onChange}
                            error={usernameBox.error ? true : false}
                            helperText={usernameBox.error ? usernameBox.helperText : ''}
                        />
                    </div>
                    <div>
                        <TextField 
                            id="password" 
                            label="Password" 
                            variant="filled" 
                            name="password" 
                            onChange={onChange} 
                            type="password"
                            error={passwordBox.error ? true : false}
                            helperText={passwordBox.error ? passwordBox.helperText : ''}
                        />
                    </div>
                    <div className={classes.buttonContainer}>
                        <Button variant="contained" onClick={onSubmit}>Login</Button>
                        <span className={classes.circle}></span>
                    </div>
                </CardContent>
            </Card>
        </div>
    )
}

export default LoginPanel;