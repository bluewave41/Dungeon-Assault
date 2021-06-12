import { applySession } from 'next-session';

export const getServerSideProps = async ({ req, res }) => {
    await applySession(req, res);

    if(!req.session.user) {
        return {
            redirect: {
                permanent: false,
                destination: '/'
            }
        }
    }
}