
exports.up = function(knex) {
	return knex.schema.alterTable('users', function(table) {
		table.integer('lastRaidedId').unsigned().references('userId').inTable('users');
	})
};

exports.down = function(knex) {
	return knex.schema.alterTable('users', function(table) {
		return table.dropColumn('lastRaidedId');
	})
};
