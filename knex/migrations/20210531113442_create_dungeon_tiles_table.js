
exports.up = function(knex) {
	return knex.schema.createTable('dungeon_tiles', function(table) {
		table.integer('userId').unsigned().references('userId').inTable('users').onDelete('cascade').notNullable();
		table.tinyint('tile').notNullable();
		table.tinyint('movement').notNullable();
		table.tinyint('trapId').references('trapId').inTable('traps').onDelete('cascade');
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('dungeon_tiles');
};
