
exports.up = function(knex) {
	return knex.schema.createTable('stable', function(table) {
		table.integer('userId').unsigned().references('userId').inTable('users').onDelete('cascade').notNullable();
		table.tinyint('raiderId').references('raiderId').inTable('raiders').onDelete('cascade').notNullable();
		table.tinyint('slot').notNullable();
		table.tinyint('attack').notNullable();
		table.tinyint('defence').notNullable();
		table.tinyint('dodge').notNullable();
		table.tinyint('sneak').notNullable();
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('stable');
};
