import RaidDungeon from 'models/RaidDungeon';

module.exports = {
    getMovableTiles: async function(userId) {
        let tiles = [];

        const dungeon = await RaidDungeon.query().select('tile', 'movement')
            .where('userId', userId)
            .where('visited', true);
    
        for(var i=0;i<dungeon.length;i++) {
            let tile = dungeon[i];
            if(tile.movement >= 8) {
                tiles.push(tile.tile + 7);
                tile.movement -= 8;
            }
            if(tile.movement >= 4) {
                tiles.push(tile.tile + 1);
                tile.movement -= 4;
            }
            if(tile.movement >= 2) {
                tiles.push(tile.tile - 1);
                tile.movement -= 2;
            }
            if(tile.movement != 0) {
                tiles.push(tile.tile - 7);
                tile.movement -= 1;
            }
        }

        return tiles;
    }
}