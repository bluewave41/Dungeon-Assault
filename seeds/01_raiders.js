
exports.seed = function(knex) {
	// Deletes ALL existing entries
	return knex('raiders').del()
	.then(function () {
		return knex('raiders').insert([
			{ id: 1,
			  name: "Goblin Runt",
              description: "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.",
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
              description: "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.",
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
              description: "The orc warrior's weapon and armour may be battered from his years of war, he remains a competent if unspectacular fighter.",
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
              description: "Like all lizardmen of the eastern deserts, the saurus spawn is sly and agile, though his simple rags and battered weapon leave something to be desired.",
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
