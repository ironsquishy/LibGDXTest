package com.mygdx.game.factories;

import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.EntityHelpers.Entity;
import com.mygdx.game.GameEntities.Tile;

/**
 * Created by admin on 8/18/2015.
 */
public class TileFactory extends EntityFactory {
    @Override
    public Diver makeDiver() {
        return null;
    }

    @Override
    public Entity makeTiles() {
        return new Tile();
    }
}
