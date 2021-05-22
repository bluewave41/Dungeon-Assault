const { useState } = require('react');
const axios = require('axios');

const Register = (props) => {
	const [user, setUser] = useState({
		username: '',
		password: '',
		confirmPassword: ''
	});

    const [errors, setErrors] = useState([]);
	
	const onChange = (e) => {
		setUser({
			...user,
			[e.target.name]: e.target.value
		});
	}
	
	const onSubmit = async (e) => {
        if(verify()) {
            const response = await axios.post('/api/auth/register', { username: user.username, password: user.password });
            if(response.ok) {
                console.log('ok');
            }
            else {
                setErrors([response.data.error]);
            }
        }
	}

    const verify = () => {
        let errors = [];
        if(!user.username) {
            errors.push("Your username cannot be empty.");
        }
        if(!user.password) {
            errors.push("Your password cannot be empty.");
        }
        if(user.password != user.confirmPassword) {
            errors.push("Your passwords don't match.");
        }
        if(user.username.length > 20) {
            errors.push("Usernames must be between 1 and 20 characters long.");
        }
        if(errors.length) {
            setErrors(errors);
            return false;
        }
        return true;
    }
	
	return (
		<div>
			<h1>Register</h1>
            <div>{errors.map(el => <div>{el}</div>)}</div>
			<div><input type="text" placeholder="Username" name="username" onChange={onChange} /></div>
			<div><input type="password" placeholder="Password" name="password" onChange={onChange} /></div>
			<div><input type="password" placeholder="Confirm password" name="confirmPassword" onChange={onChange} /></div>
			<button onClick={onSubmit}>Submit</button>
		</div>
	)
}

module.exports = Register;