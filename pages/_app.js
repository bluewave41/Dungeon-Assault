import React from 'react';
import PropTypes from 'prop-types';
import Head from 'next/head';
import { ThemeProvider } from '@material-ui/core/styles';
import CssBaseline from '@material-ui/core/CssBaseline';
import theme from '../src/theme';
import NavBar from 'components/NavBar';
import { applySession } from 'next-session';

export default function MyApp(props) {
  const { Component, pageProps } = props;
  const [username, setUsername] = React.useState(pageProps.username);

  React.useEffect(() => {
    // Remove the server-side injected CSS.
    const jssStyles = document.querySelector('#jss-server-side');
    if (jssStyles) {
      jssStyles.parentElement.removeChild(jssStyles);
    }
  }, []);

  return (
    <React.Fragment>
      <Head>
        <title>My page</title>
        <meta name="viewport" content="minimum-scale=1, initial-scale=1, width=device-width" />
      </Head>
      <ThemeProvider theme={theme}>
        {/* CssBaseline kickstart an elegant, consistent, and simple baseline to build upon. */}
        <CssBaseline />
        <NavBar username={username} />
        <Component {...pageProps} setUsername={setUsername}/>
      </ThemeProvider>
    </React.Fragment>
  );
}

MyApp.getInitialProps = async(appContext) => {
    if(typeof window !== 'undefined') { //this runs on the client side
        return {
            username: ''
        }
    }

    const { req, res } = appContext.ctx;

    //below here runs on the server
    await applySession(req, res);

    return {
        pageProps: {
            username: req.session.user?.username
        }
    }
}

MyApp.propTypes = {
    Component: PropTypes.elementType.isRequired,
    pageProps: PropTypes.object.isRequired,
};