const { Model } = require('objection');

class Stable extends Model {
	static get tableName() {
		return 'stable';
	}

    static async getRaiders(userId) {
        let raiders = await this.query().withGraphFetched('information').where('userId', userId);
        raiders.forEach(el => el.name = el.information.name);
        return raiders;
    }

    static get relationMappings() {
        const Raider = require('./Raider');

        return {
            information: {
                relation: Model.BelongsToOneRelation,
                modelClass: Raider,
                join: {
                    from: 'stable.raiderId',
                    to: 'raiders.raiderId'
                }
            }
        }

    }
}

module.exports = Stable;