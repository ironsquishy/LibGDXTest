package com.mygdx.game.EntityHelpers.SpriteHelpers;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 * Created by admin on 8/18/2015.
 */
public class SpriteAnimation extends Animation {

    private float scaleX;
    private float scaleY;
    private float timepassed;
    private TextureRegion textures;
    private TextureRegion[] regions;

    Array<? extends TextureRegion> mKeyFrames;



    public SpriteAnimation(float frameDuration, Array<? extends TextureRegion> keyFrames, float
            scale) {
        super(frameDuration, keyFrames);

        this.mKeyFrames = keyFrames;

        regions = getKeyFrames();

        this.scaleX = scale;
        this.scaleY = scale;

    }

    public SpriteAnimation(float frameDuration, Array<? extends TextureRegion> keyFrames, PlayMode playMode) {
        super(frameDuration, keyFrames, playMode);
    }

    public SpriteAnimation(float frameDuration, TextureRegion... keyFrames) {
        super(frameDuration, keyFrames);
    }

    public void draw(float delta, SpriteBatch batch, float x, float y)
    {
        textures = getKeyFrame(timepassed+=delta, true);
        batch.draw(textures, x, y, textures.getRegionWidth() * scaleX, textures.getRegionHeight() * scaleY);
    }

    public TextureRegion getTexture(float delta)
    {   textures = getKeyFrame(timepassed += delta, true);
        return textures;
    }

    public TextureRegion getFirstTexture()
    {
        //regions = getKeyFrames();

        return regions[0];
    }

    public float getWidth()
    {
        return regions[0].getRegionWidth();
    }

    public float getHeight() {return regions[0].getRegionHeight();}

    public float getScaleX()
    {
        return scaleX;
    }

    public float getScaleY()
    {
        return scaleY;
    }

}
