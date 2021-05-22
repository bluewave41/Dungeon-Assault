
exports.seed = function(knex) {
	// Deletes ALL existing entries
	return knex('raiders').del()
	.then(function () {
		return knex('raiders').insert([
			{ id: 1,
			  name: "Goblin Runt",
			  renown: 0,
			  treasure: 0,
			  attack: 1,
			  defence: 1,
			  dodge: 1,
			  sneak: 1,
			  stealableGold: 400
			},
			{ id: 2,
			  name: "Goblin Cleaver",
			  renown: 0,
			  treasure: 10,
			  attack: 2,
			  defence: 1,
			  dodge: 2,
			  sneak: 1,
			  stealableGold: 600
			},
			{ id: 3,
			  name: "Orc Warrior",
			  renown: 0,
			  treasure: 15,
			  attack: 2,
			  defence: 2,
			  dodge: 1,
			  sneak: 1,
			  stealableGold: 600
			},
			{ id: 4,
			  name: "Saurus Spawn",
			  renown: 0,
			  treasure: 20,
			  attack: 1,
			  defence: 1,
			  dodge: 3,
			  sneak: 2,
			  stealableGold: 700
			},
		]);
	});
};
