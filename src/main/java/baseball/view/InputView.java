package baseball.view;

import baseball.view.valid.ValidInputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final List<ValidInputView> validInputViewList;

    public InputView(List<ValidInputView> validInputViewList) {
        this.validInputViewList = validInputViewList;
    }

    public List<Integer> readInput() {
        String input = Console.readLine();
        String[] split = input.split("");
        List<String> inputStringList = Arrays.asList(split);
        this.isValidInput(inputStringList);
        return inputStringList.stream()
                .map(Integer::parseInt)
                .toList();
    }

    private void isValidInput(List<String> inputStringList) {
        for (ValidInputView validInputView : validInputViewList) {
            validInputView.validate(inputStringList);
        }
    }
}
