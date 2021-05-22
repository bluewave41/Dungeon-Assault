
exports.up = function(knex) {
	return knex.schema.createTable('users', function(table) {
		table.increments();
		table.string('username', 20).notNullable();
		table.specificType('password', 'char(60)').notNullable();
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('users');
};