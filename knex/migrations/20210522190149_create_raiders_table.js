
exports.up = function(knex) {
	return knex.schema.createTable('raiders', function(table) {
		table.tinyint('raiderId').primary().notNullable();
		table.string('name', 20).notNullable();
		table.string('description', 255);
		table.integer('renown').notNullable();
		table.integer('treasure').notNullable();
		table.tinyint('attack').notNullable();
		table.tinyint('defence').notNullable();
		table.tinyint('dodge').notNullable();
		table.tinyint('sneak').notNullable();
		table.integer('stealableGold').notNullable();
	});
};

exports.down = function(knex) {
	return knex.schema.dropTable('raiders');
};