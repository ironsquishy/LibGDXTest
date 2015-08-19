package com.mygdx.game.GameEntities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mygdx.game.SpriteHelpers.SpriteAnimation;

/**
 * Created by admin on 8/18/2015.
 */
public class Diver extends Sprite implements PhyscalAttributes{


    private TextureAtlas divertexture;

    private SpriteAnimation animation;

    public Diver()
    {
        setAnimation();
    }

    @Override
    public void setPhysicsBody()
    {

    }

    private void setAnimation()
    {
        divertexture = new TextureAtlas(Gdx.files.internal("diverimages.atlas"));

        animation = new SpriteAnimation(1/8f, divertexture.getRegions(), 0.5f);
    }


    public void draw(SpriteBatch batch, float delta, float x, float y)
    {
        //animation.draw(delta, batch, x, y);

        batch.draw(animation.getTexture(delta), x, y, animation.getWidth(), animation.getHeight());
    }

    public void draw(Batch batch, float delta, float x, float y) {
        super.draw(batch);
        batch.draw(animation.getTexture(delta), x, y, animation.getWidth(), animation.getHeight());
    }
}