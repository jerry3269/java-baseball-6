package baseball.view;

import baseball.view.valid.ValidInputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static baseball.constant.NumberConstant.*;

public class InputView {
    private final ValidInputView validInputView;

    public InputView(ValidInputView validInputView) {
        this.validInputView = validInputView;
    }

    public List<Integer> readInput() {
        String input = Console.readLine();
        String[] split = input.split("");
        List<String> inputStringList = Arrays.asList(split);
        this.isValidGuessNumber(inputStringList);
        return inputStringList.stream()
                .map(Integer::parseInt)
                .toList();
    }

    private void isValidGuessNumber(List<String> inputStringList) {
        validInputView.validDigit(inputStringList, CREATE_NUMBER_DIGIT.value());
        validInputView.validNoDubNumber(inputStringList);
        validInputView.validRange(
                inputStringList,
                MIN_RANDOM_NUMBER.value(),
                MAX_RANDOM_NUMBER.value()
        );
    }

    public boolean readRestartToken() {
        String input = Console.readLine();
        String[] split = input.split("");
        List<String> inputStringList = Arrays.asList(split);
        this.isvalidRestartToken(inputStringList);
        int restartToken = Integer.parseInt(input);

        if(restartToken == RESTART.value()) return true;
        if(restartToken == END.value()) return false;
        return false;
    }

    private void isvalidRestartToken(List<String> inputStringList) {
        validInputView.validDigit(inputStringList, RESTART_TOKEN_DIGIT.value());
        validInputView.validRange(
                inputStringList,
                MIN_RESTART_TOKEN.value(),
                MAX_RESTART_TOKEN.value()
        );
    }
}
