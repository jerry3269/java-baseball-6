package baseball.view;

import baseball.view.valid.ValidInputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    private final List<ValidInputView> validInputViewList;

    public InputView(List<ValidInputView> validInputViewList) {
        this.validInputViewList = validInputViewList;
    }

    public int readInput() {
        String input = Console.readLine();
        this.isValidInput(input);
        return Integer.parseInt(input);
    }

    private void isValidInput(String input) {
        for (ValidInputView validInputView : validInputViewList) {
            validInputView.validate(input);
        }
    }
}
