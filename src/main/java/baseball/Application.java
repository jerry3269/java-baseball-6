package baseball;

import baseball.config.GameManagerBuilder;
import baseball.controller.GameManager;

public class Application {
    public static void main(String[] args) {
        GameManagerBuilder gameManagerBuilder = new GameManagerBuilder();
        GameManager gameManager = gameManagerBuilder.getGameManager();
        gameManager.run();
    }
}
