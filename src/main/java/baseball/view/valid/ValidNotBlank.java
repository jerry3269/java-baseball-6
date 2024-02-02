package baseball.view.valid;

import static baseball.constant.ExceptionConstant.BLANK_ERROR;

public class ValidNotBlank implements ValidInputView{
    @Override
    public void validate(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(BLANK_ERROR.message());
        }
    }
}
