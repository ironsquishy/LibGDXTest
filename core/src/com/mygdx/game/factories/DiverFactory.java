package com.mygdx.game.factories;

import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.GameEntities.Tile;

/**
 * Created by admin on 8/18/2015.
 */
public class DiverFactory extends EntityFactory {
    @Override
    public Diver makeDiver() {
        return new Diver();
    }

    @Override
    public Tile makeTiles() {
        return null;
    }
}
