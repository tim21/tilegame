package com.vellelith.tilegame;

import com.vellelith.tilegame.utils.ApplicationUpdaterRenderer;
import gamestates.GameStateManager;

public class Game extends ApplicationUpdaterRenderer {

    private static GameStateManager gsm;

    @Override
    public void game_update(float deltaTime) {
        gsm.update(deltaTime);
    }

    @Override
    public void game_render() {
        gsm.render();
    }

    @Override
    public void create() {
        gsm = new GameStateManager();
    }

    @Override
    public void resize(int width, int height) {
        gsm.resize(width, height);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        gsm.dispose();
    }
}
