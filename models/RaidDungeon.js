const { Model } = require('objection');

class RaidDungeon extends Model {
	static get tableName() {
		return 'raid_dungeon';
	}
}

module.exports = RaidDungeon;