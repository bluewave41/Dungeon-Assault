
exports.up = function(knex) {
	return knex.schema.createTable('stable', function(table) {
		table.integer('userId').unsigned().references('userId').inTable('users').notNullable();
		table.tinyint('raiderId').references('raiderId').inTable('raiders').notNullable();
		table.tinyint('slot').notNullable();
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('stable');
};
