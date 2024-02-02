package baseball.view;

import baseball.view.valid.ValidInputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static baseball.constant.ExceptionConstant.*;
import static baseball.constant.NumberConstant.*;

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

    public boolean readRestartToken(boolean runToken) {
        String input = Console.readLine();
        int startToken;

        if(input.isBlank()) throw new IllegalArgumentException(BLANK_ERROR.message());

        try {
            startToken  = Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NO_NUMERIC_ERROR.message());
        }

        if (input.split("").length != MAX_READ_TOKEN_NUMBER.intValue()) {
            throw new IllegalArgumentException(NOT_ONE_DIGIT_ERROR.message());
        }
        
        if(startToken == RESTART.intValue()) return true;
        if(startToken == END.intValue()) return false;
        throw new IllegalArgumentException(NOT_ONE_OR_TWO_ERROR.message());
    }
}
