package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.sun.javafx.stage.ScreenHelper;

/**
 * Created by admin on 8/18/2015.
 */
public class MainMenuScreen implements Screen{

    public final Drop mGame;
    private static OrthographicCamera mCamera;

    public MainMenuScreen(final Drop game)
    {
        mGame = game;
        mCamera = new OrthographicCamera();
        mCamera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        mCamera.update();
        mGame.batch.setProjectionMatrix(mCamera.combined);

        mGame.batch.begin();

        mGame.font.draw(mGame.batch, "Welcome!", 100, 150);
        mGame.font.draw(mGame.batch, "Tap any where to begin!", 100, 100);

        mGame.batch.end();

        if(Gdx.input.isTouched())
        {
            Gdx.app.log("LIBGDX", "Going to test.");
            mGame.setScreen(new LibGdxMainTest(mGame));
            dispose();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
