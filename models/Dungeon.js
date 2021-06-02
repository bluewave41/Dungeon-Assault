const { Model } = require('objection');

class Dungeon extends Model {
	static get tableName() {
		return 'dungeons';
	}
    getPlacedTraps() {
        let arr = [];
        
        arr.push([this.tile1, this.tile2, this.tile3, this.tile4, this.tile5, this.tile6, this.tile7]);
        arr.push([this.tile8, this.tile9, this.tile10, this.tile11, this.tile12, this.tile13, this.tile14]);
        arr.push([this.tile15, this.tile16, this.tile17, this.tile18, this.tile19, this.tile20, this.tile21]);
        arr.push([this.tile22, this.tile23, this.tile24, this.tile25, this.tile26, this.tile27, this.tile28]);
        arr.push([this.tile29, this.tile30, this.tile31, this.tile32, this.tile33, this.tile34, this.tile35]);
        arr.push([this.tile36, this.tile37, this.tile38, this.tile39, this.tile40, this.tile41, this.tile42]);
        arr.push([this.tile43, this.tile44, this.tile45, this.tile46, this.tile47, this.tile48, this.tile49]);

        return arr;
    }
}

module.exports = Dungeon;