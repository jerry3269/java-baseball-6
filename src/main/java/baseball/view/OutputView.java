package baseball.view;

import static baseball.constant.MessageConstant.INIT_GAME_MESSAGE;

public class OutputView {

    public void printGameStart() {
        System.out.println(INIT_GAME_MESSAGE.message());
    }
}
