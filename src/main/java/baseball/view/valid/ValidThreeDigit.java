package baseball.view.valid;

import static baseball.constant.ExceptionConstant.NOT_THREE_DIGIT_ERROR;
import static baseball.constant.NumberConstant.MAX_CREATE_NUMBER;

public class ValidThreeDigit implements ValidInputView{
    private final ValidNumeric validNumeric;

    public ValidThreeDigit(ValidNumeric validNumeric) {
        this.validNumeric = validNumeric;
    }

    @Override
    public void validate(String input) {
        validNumeric.validate(input);

        String[] split = input.split("");
        if (split.length != MAX_CREATE_NUMBER.intValue()) {
            throw new IllegalArgumentException(NOT_THREE_DIGIT_ERROR.message());
        }
    }
    
}
