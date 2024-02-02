package baseball.view;

import static baseball.constant.MessageConstant.INIT_GAME_MESSAGE;
import static baseball.constant.MessageConstant.INPUT_NUMBER_MESSAGE;

public class OutputView {

    public void gameStartMessage() {
        System.out.println(INIT_GAME_MESSAGE.message());
    }


    public void inputNumberMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE.message());
    }
}
