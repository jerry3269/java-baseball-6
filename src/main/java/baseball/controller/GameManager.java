package baseball.controller;

import baseball.domain.Count;
import baseball.service.RandomNumberCreator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class GameManager {

    private final OutputView outputView;
    private final RandomNumberCreator randomNumberCreator;
    private final InputView inputView;

    public GameManager(OutputView outputView,
                       RandomNumberCreator randomNumberCreator,
                       InputView inputView) {
        this.outputView = outputView;
        this.randomNumberCreator = randomNumberCreator;
        this.inputView = inputView;
    }

    //TODO: 게임 시작, 게임 진행, 게임 종료 별로 메서드로 묶기
    public void run() {
        //게임 시작
        outputView.gameStartMessage();
        List<Integer> createNumber = randomNumberCreator.createNumber();
        System.out.println(createNumber);

        boolean restartToken = true;

        //게임 진행
        while (restartToken) {
            outputView.inputNumberMessage();
            List<Integer> guessNumber = inputView.readInput();
            Count count = Count.valueOf(createNumber, guessNumber);
            outputView.countToStringMessage(count);
            if(count.isOut()) {
                outputView.gameEndMessage();
                restartToken = inputView.readRestartToken(restartToken);
                if(restartToken) createNumber = randomNumberCreator.createNumber();
            }
        }
    }


}
