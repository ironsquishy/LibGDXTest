package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by admin on 8/18/2015.
 */
public class Drop extends Game
{
    SpriteBatch batch;
    BitmapFont font;


    @Override
    public void create()
    {
        batch = new SpriteBatch();
        font = new BitmapFont();
        Gdx.app.setLogLevel(Application.LOG_INFO);

        Gdx.app.log("LIBGDX", "Transfer to Menu.");

        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        font.dispose();
    }
}
