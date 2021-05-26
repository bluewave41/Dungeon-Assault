
exports.up = function(knex) {
	return knex.schema.createTable('traps', function(table) {
		table.tinyint('id').primary().notNullable();
		table.string('name', 20).notNullable();
		table.string('description', 255);
		table.integer('renown').notNullable();
		table.integer('treasure').notNullable();
		table.tinyint('attack').notNullable();
		table.tinyint('defence').notNullable();
		table.tinyint('snare').notNullable();
		table.tinyint('detect').notNullable();
		table.boolean('isMonster').notNullable();
		table.boolean('isFatal').notNullable();
	});
};

exports.down = function(knex) {
	return knex.schema.dropTable('traps');
};