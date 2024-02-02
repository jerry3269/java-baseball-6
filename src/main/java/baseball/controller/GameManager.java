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

    //TODO: 게임 시작, 게임 진행, 게임 종료 별로 메서드로 묶기
    public void run() {
        //게임 시작
        outputView.printGameStart();
        List<Integer> createNumber = randomNumberCreator.createNumber();

        //게임 진행
        while (true) {
            outputView.inputNumberMessage();
            break;
        }
        
    }


}
