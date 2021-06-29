
exports.up = function(knex) {
	return knex.schema.createTable('raid_dungeon', function(table) {
		table.integer('userId').unsigned().references('userId').inTable('users').onDelete('cascade').notNullable();
		table.tinyint('tile').notNullable();
		table.tinyint('movement').notNullable();
		table.tinyint('trapId').references('trapId').inTable('traps').onDelete('cascade');
		table.boolean('active').defaultsTo('true');
		table.boolean('visited').defaultsTo('false');
	});
};

exports.down = function(knex) {
	return knex.schema.dropTable('raid_dungeon');
};
