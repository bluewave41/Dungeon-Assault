const { Model } = require('objection');

class DungeonTiles extends Model {
	static get tableName() {
		return 'dungeon_tiles';
	}
}

module.exports = DungeonTiles;