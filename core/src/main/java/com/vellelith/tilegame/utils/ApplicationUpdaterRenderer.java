package com.vellelith.tilegame.utils;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public abstract class ApplicationUpdaterRenderer implements ApplicationListener {

    @Override
    public void render() {
        game_update(Gdx.graphics.getDeltaTime());
        game_render();
    }

    public abstract void game_update(float deltaTime);

    public abstract void game_render();
}
