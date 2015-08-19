package com.mygdx.game.factories;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.GameEntities.Tile;

/**
 * Created by admin on 8/18/2015.
 */
public abstract class EntityFactory {

    public abstract Diver makeDiver();

    public abstract Tile makeTiles();



}
