const { useState } = require('react');
import applySession from 'next-session';
const Raider = require('models/Raider');
const RaiderPanel = require('components/stable/RaiderPanel');

const Stable = (props) => {
    return (
        <div>
            <h1>Stable</h1>
            <RaiderPanel raiders={props.raiders} />
        </div>
    )
}

export async function getServerSideProps(context) {
    const { req, res } = context;
    console.log('here')
    await applySession(req, res);

    const raiders = await Raider.query();
    console.log('here', raiders);

    return {
        props: {
            raiders: raiders
        }
    }
}

module.exports = Stable;