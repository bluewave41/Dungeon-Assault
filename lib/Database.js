const { Model } = require('objection');
const Knex = require('knex');

const knex = Knex({
    client: 'mysql2',
    connection: {
        database: process.env.DB,
        user: process.env.DB_USER,
        password: process.env.DB_PASSWORD
    }
});

Model.knex(knex);