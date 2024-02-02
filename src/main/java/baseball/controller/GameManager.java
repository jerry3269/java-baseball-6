package baseball.controller;

import baseball.service.RandomNumberCreator;
import baseball.view.OutputView;

import java.util.List;

public class GameManager {

    private final OutputView outputView;
    private final RandomNumberCreator randomNumberCreator;

    public GameManager(OutputView outputView,
                       RandomNumberCreator randomNumberCreator) {
        this.outputView = outputView;
        this.randomNumberCreator = randomNumberCreator;
    }

    public void run() {
        outputView.printGameStart();
        List<Integer> createNumber = randomNumberCreator.createNumber();
    }


}
