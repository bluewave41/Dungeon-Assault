const { Model } = require('objection');

class RaidStatus extends Model {
	static get tableName() {
		return 'raid_status';
	}
}

module.exports = RaidStatus;