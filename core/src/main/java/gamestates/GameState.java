package gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public abstract class GameState {

    protected GameState() {
    }

    abstract void update(float deltaTime);

    abstract void render();

    public void clearScreen() {
        Gdx.graphics.getGL20().glClearColor(0, 0, 0, 1);
        Gdx.graphics.getGL20().glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
    }

    abstract void handleInput();

    public void resize(int width, int height) {

    }

    abstract void dispose();
}
