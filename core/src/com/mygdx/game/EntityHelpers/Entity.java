package com.mygdx.game.EntityHelpers;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by core6_000 on 8/19/2015.
 */
public abstract class Entity extends Sprite implements PhyscalAttributes{

    public Entity() {
        super();
    }

    public void draw() {}

    public abstract void draw(SpriteBatch batch, float delta, float x, float y);

    @Override
    public void setPhysicsBody() {

    }

}
