package baseball.view.valid;

import static baseball.constant.ExceptionConstant.NO_NUMERIC_ERROR;

public class ValidNumeric implements ValidInputView{
    @Override
    public void validate(String input) {
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NO_NUMERIC_ERROR.message());
        }
    }
}
