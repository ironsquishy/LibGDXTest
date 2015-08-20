package com.mygdx.game.factories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mygdx.game.EntityHelpers.SpriteHelpers.SpriteAnimation;
import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.EntityHelpers.Entity;
import com.mygdx.game.GameEntities.Tile;

/**
 * Created by admin on 8/18/2015.
 */
public class DiverFactory extends EntityFactory {

    private Diver mDiver;
    private TextureAtlas divertexture;
    private SpriteAnimation animation;
    private float originX, originY;


    @Override
    public Entity makeDiver()
    {
        divertexture = new TextureAtlas(Gdx.files.internal("diverimages.atlas"));

        animation = new SpriteAnimation(1/8f, divertexture.getRegions(), 1.0f);

        originX = animation.getWidth();
        originY = animation.getHeight();

        mDiver = new Diver(animation);

        mDiver.setOrigin(originX, originY);

        return mDiver;
    }

    @Override
    public Tile makeTiles() {
        return null;
    }
}
