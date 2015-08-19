package com.mygdx.game.factories;

import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.EntityHelpers.Entity;
import com.mygdx.game.GameEntities.Tile;

/**
 * Created by admin on 8/18/2015.
 */
public class DiverFactory extends EntityFactory {

    private Diver mDiver;

    @Override
    public Entity makeDiver()
    {
        mDiver = new Diver();
        mDiver.setAnimation();
        return mDiver;
    }

    @Override
    public Tile makeTiles() {
        return null;
    }
}
