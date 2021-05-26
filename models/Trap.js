const { Model } = require('objection');

class Trap extends Model {
	static get tableName() {
		return 'traps';
	}
}

module.exports = Trap;