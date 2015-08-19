package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Circle;
import com.mygdx.game.GameEntities.Diver;
import com.mygdx.game.SpriteHelpers.SpriteAnimation;
import com.mygdx.game.factories.EntityFactorProducer;
import com.mygdx.game.factories.EntityFactory;


public class LibGdxMainTest implements Screen {

	Drop mGame;

	InputGameEvent mInput;

	OrthographicCamera camera;

	Circle circle;

	Diver mDiver;


	public LibGdxMainTest (final Drop game)//Load for now
	{
		Gdx.app.setLogLevel(Application.LOG_INFO);
		mGame = game;

		mInput = new InputGameEvent();

		Gdx.input.setInputProcessor(mInput);


		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		EntityFactory entityFactory = EntityFactorProducer.getInstance().getDiverFactory();

		mDiver = entityFactory.makeDiver();

		Gdx.app.log("LIBGDX", "Loaded animations and fonts");
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		// tell the camera to update its matrices.
		camera.update();

		// tell the SpriteBatch to render in the
		// coordinate system specified by the camera.
		mGame.batch.setProjectionMatrix(camera.combined);

		mGame.batch.begin();

		mDiver.draw(mGame.batch, delta, 0, 420);

		mGame.batch.end();

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
