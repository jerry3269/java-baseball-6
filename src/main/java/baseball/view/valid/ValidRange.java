package baseball.view.valid;

import static baseball.constant.ExceptionConstant.INCLUDE_ZERO_ERROR;
import static baseball.constant.NumberConstant.ZERO;

public class ValidRange implements ValidInputView{
    @Override
    public void validate(String input) {
        String[] split = input.split("");
        for (String number : split) {
            if (number.equals(ZERO.stringValue())) {
                throw new IllegalArgumentException(INCLUDE_ZERO_ERROR.message());
            }
        }
    }
}
