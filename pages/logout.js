import axios from 'axios';

const Logout = (props) => {
    axios.post('/api/auth/logout').then(function() {
        window.location.href = '/';
    });

    return null;
}

export default Logout;