package baseball.view;

import baseball.domain.Count;

import static baseball.constant.MessageConstant.*;

public class OutputView {
    public void gameStartMessage() {
        System.out.println(INIT_GAME_MESSAGE.message());
    }
    public void inputNumberMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE.message());
    }
    public void countToStringMessage(Count count) {
        System.out.println(count.toString());
    }
    public void gameEndMessage() {
        System.out.println(THREE_STRIKE_MESSAGE.message());
        System.out.println(NEW_GAME_OR_NOT_MESSAGE.message());
    }
}
