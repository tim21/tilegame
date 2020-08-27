package gamestates;

public class GameStateManager {

    private GameState currentState;

    public GameStateManager() {
        currentState = new PlayState();
    }

    public void update(float deltaTime) {
        currentState.update(deltaTime);
    }

    public void render() {
        currentState.render();
    }

    public void resize(int width, int height) {
        currentState.resize(width, height);
    }

    public void dispose() {
        currentState.dispose();
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }
}
