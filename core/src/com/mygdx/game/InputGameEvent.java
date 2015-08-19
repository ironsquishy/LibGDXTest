package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by admin on 8/18/2015.
 */
public class InputGameEvent implements InputProcessor {


    private static String message = "NoEvent";

    public InputGameEvent()
    {
        //default constructor.
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        message = "Touch down -> "+ screenX + ", " + screenY;

        Gdx.app.log("LIBGDX", "Touch at: " + message);

        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button)
    {
        message = "Touch up -> "+ screenX + "," + screenY;

        Gdx.app.log("LIBGDX", "Touch at: " + message);

        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }



    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    public String getMessageInput()
    {
        return message;
    }
}
