package baseball.controller;

import baseball.view.OutputView;

public class GameManager {

    private final OutputView outputView;

    public GameManager(OutputView outputView) {
        this.outputView = outputView;
    }

    public void run() {
        outputView.printGameStart();
    }


}
