import { applySession } from 'next-session';

const RedirectLoggedIn = async ({req, res}) => {
    await applySession(req, res);

    if(req.session.user) {
        return {
            redirect: {
                permanent: false,
                destination: '/'
            }
        }
    }
}

export default RedirectLoggedIn;