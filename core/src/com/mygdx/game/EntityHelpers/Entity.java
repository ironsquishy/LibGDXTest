package com.mygdx.game.EntityHelpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by core6_000 on 8/19/2015.
 */
public abstract class Entity extends Sprite implements PhyscalAttributes{

    public Entity() {
        super();
    }


    public Entity(TextureRegion textureRegion)
    {
        super(textureRegion.getTexture());
    }

    public void draw() {}

    public void draw(SpriteBatch batch, float x, float y)
    {
        super.draw(batch);
    }

    public void draw(SpriteBatch batch, float delta,  float x, float y)
    {
        super.draw(batch);

    }

    @Override
    public void setRegion(Texture texture) {
        super.setRegion(texture);
    }

    @Override
    public void setPhysicsBody() {

    }

    @Override
    public void setPosition(float x, float y) {
        super.setPosition(x, y);
    }

    @Override
    public void setSize(float width, float height) {
        super.setSize(width, height);
    }

    @Override
    public void setRotation(float degrees) {
        super.setRotation(degrees);
    }

    @Override
    public void rotate(float degrees) {
        super.rotate(degrees);
    }

    @Override
    public float getRotation() {
        return super.getRotation();
    }


}
