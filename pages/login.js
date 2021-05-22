const { default: axios } = require('axios');
const { useState } = require('react');

const Login = (props) => {
    const [user, setUser] = useState({
        username: '',
        password: ''
    });

    const [errors, setErrors] = useState([[]]);

    const onChange = (e) => {
        setUser({
            ...user,
            [e.target.name]: e.target.value
        });
    }

    const verify = (e) => {
        let errors = [];
        if(!user.username) {
            errors.push("You didn't enter your username.");
        }
        if(!user.password) {
            errors.push("You didn't enter your password.");
        }
        if(user.username.length > 20) {
            errors.push("Your username is too long. Usernames must be between 1 and 20 characters.");
        }
        if(errors.length) {
            setErrors(errors);
            return false;
        }
        return true;
    }

    const onSubmit = async (e) => {
        if(verify()) {
            const response = await axios.post('/api/auth/login', { username: user.username, password: user.password });
            if(response.ok) {

            }
            else {

            }
        }
    }

    return (
        <div>
            <h1>Login</h1>
            <div>{errors.map(el => <div>{el}</div>)}</div>
            <div><input type="text" placeholder="Username" name="username" onChange={onChange} /></div>
            <div><input type="password" placeholder="Password" name="password" onChange={onChange} /></div>
            <button onClick={onSubmit}>Login</button>
        </div>
    )
}

module.exports = Login;