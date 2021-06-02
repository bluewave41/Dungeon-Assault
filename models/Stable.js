const { Model } = require('objection');

class Stable extends Model {
	static get tableName() {
		return 'stable';
	}
}

module.exports = Stable;