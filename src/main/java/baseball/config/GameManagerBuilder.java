package baseball.config;

import baseball.controller.GameManager;
import baseball.service.RandomNumberCreator;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.valid.InputViewValidator;

public class GameManagerBuilder {
    public GameManager getGameManager() {
        return new GameManager(
                getOutputView(),
                getRandomNumberCreator(),
                getInputView()
        );
    }

    private OutputView getOutputView() {
        return new OutputView();
    }

    private RandomNumberCreator getRandomNumberCreator() {
        return new RandomNumberCreator();
    }

    private InputView getInputView() {
        return new InputView(getInputViewValidator());
    }

    private InputViewValidator getInputViewValidator() {
        return new InputViewValidator();
    }
}
