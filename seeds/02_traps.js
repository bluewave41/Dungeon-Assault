
exports.seed = function(knex) {
	// Deletes ALL existing entries
	return knex('traps').del()
	.then(function () {
		return knex('traps').insert([
			{ trapId: 1,
			  name: "Tripwire Bell",
              description: "The tripwires in this room cause lots of bells to ring and chime, alerting monsters throughout the dungeon.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 1.",
			  renown: 250,
			  treasure: 10,
			  attack: 0,
			  defence: 0,
			  snare: 0,
			  detect: 2,
			  isMonster: false,
			  isFatal: false
			},
			{ trapId: 2,
			  name: "Giant Rats",
              description: "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.",
			  renown: 250,
			  treasure: 10,
			  attack: 1,
			  defence: 1,
			  snare: 1,
			  detect: 1,
			  isMonster: true,
			  isFatal: false
			},
			{ trapId: 3,
			  name: "Snakes",
              description: "A shallow pit occupies the centre of this room, within which a mass of black and green snakes writhe.",
			  renown: 250,
			  treasure: 10,
			  attack: 0,
			  defence: 0,
			  snare: 1,
			  detect: 1,
			  isMonster: false,
			  isFatal: false
			},
			{ trapId: 4,
			  name: "Pit",
              description: "The pit in this room prevents raiders from easily crossing it.",
			  renown: 250,
			  treasure: 20,
			  attack: 0,
			  defence: 0,
			  snare: 1,
			  detect: 4,
			  isMonster: false,
			  isFatal: false
			},
		]);
	});
};
