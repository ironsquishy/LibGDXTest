package com.mygdx.game.GameEntities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.EntityHelpers.Entity;
import com.mygdx.game.EntityHelpers.SpriteHelpers.SpriteAnimation;

/**
 * Created by admin on 8/18/2015.
 */
public class Diver extends Entity{


    private TextureAtlas divertexture;

    private SpriteAnimation animation;

    public Diver(SpriteAnimation pAnimation)
    {
        super(pAnimation.getFirstTexture());
        this.animation = pAnimation;

    }

    public Diver(TextureRegion pTextureRegion)
    {
        super(pTextureRegion);
    }
    public void setAnimation()
    {
        divertexture = new TextureAtlas(Gdx.files.internal("diverimages.atlas"));

        animation = new SpriteAnimation(1/8f, divertexture.getRegions(), 1);
    }

    public SpriteAnimation getAnimation()
    {
        return animation;
    }


    @Override
    public void draw(SpriteBatch batch, float delta, float x, float y)
    {
        setPosition(x, y);

        setOriginCenter();

        setRegion(animation.getKeyFrame(delta));

        batch.draw(animation.getTexture(delta), x, y);

        /*public void draw (TextureRegion region, float x, float y, float originX, float originY,
        float width, float height -100,float scaleX, float scaleY, float rotation, boolean
        clockwise*/

    }

    @Override
    public void setPosition(float x, float y) {
        super.setPosition(x, y);
    }

    @Override
    public void rotate(float degrees) {
        super.rotate(degrees);

    }


}
    /*public void draw (TextureRegion region, float x, float y, float originX, float originY,
        float width, float height,float scaleX, float scaleY, float rotation, boolean clockwise*/