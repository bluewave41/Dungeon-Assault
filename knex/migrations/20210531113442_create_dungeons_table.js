
exports.up = function(knex) {
	return knex.schema.createTable('dungeons', function(table) {
		table.integer('userId').unsigned().references('userId').inTable('users').notNullable();
		table.integer('seed1').notNullable();
		table.integer('seed2').notNullable();
		table.integer('seed3').notNullable();
		for(var i=1;i<50;i++) {
			if(i == 25) {
				table.tinyint('tile' + i).defaultsTo(126);
			}
			else if(i == 1 || i == 7 || i == 43 || i == 49) { //corner or center
				table.tinyint('tile' + i).defaultsTo(127).notNullable();
			}
			else {
				table.tinyint('tile' + i).defaultsTo(0).notNullable();
			}
		}
	})
};

exports.down = function(knex) {
	return knex.schema.dropTable('dungeons');
};
