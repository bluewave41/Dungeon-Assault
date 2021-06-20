
exports.up = function(knex) {
	return knex.schema.createTable('users', function(table) {
		table.increments('userId');
		table.string('username', 20).notNullable();
		table.specificType('password', 'char(60)').notNullable
		table.integer('gold').defaultsTo(1000).notNullable();
		table.integer('renown').defaultsTo(1000).notNullable();
		table.integer('seed1').notNullable();
		table.integer('seed2').notNullable();
		table.integer('seed3').notNullable();
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('users');
};