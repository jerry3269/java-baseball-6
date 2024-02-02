package baseball.view.valid;

import java.util.List;

import static baseball.constant.ExceptionConstant.INCLUDE_ZERO_ERROR;
import static baseball.constant.NumberConstant.ZERO;

public class ValidRange implements ValidInputView{
    @Override
    public void validate(List<String> inputStringList) {
        for (String number : inputStringList) {
            if (number.equals(ZERO.stringValue())) {
                throw new IllegalArgumentException(INCLUDE_ZERO_ERROR.message());
            }
        }
    }
}
