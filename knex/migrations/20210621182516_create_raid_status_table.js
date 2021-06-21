
exports.up = function(knex) {
	return knex.schema.createTable('raid_status', function(table) {
		table.integer('userId').unsigned().primary().references('userId').inTable('users').onDelete('cascade').notNullable();
		table.integer('targetId').unsigned().references('userId').inTable('users').onDelete('cascade').notNullable();
		table.tinyint('raider1').notNullable();
		table.tinyint('raider2').notNullable();
		table.tinyint('raider3').notNullable();
		table.tinyint('raider4').notNullable();
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('raid_status');
};
