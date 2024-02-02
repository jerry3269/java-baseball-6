package baseball.view.valid;

import java.util.List;

import static baseball.constant.ExceptionConstant.NO_NUMERIC_ERROR;

public class ValidNumeric implements ValidInputView{
    @Override
    public void validate(List<String> inputStringList) {
        try {
            String input = String.join("", inputStringList);
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NO_NUMERIC_ERROR.message());
        }
    }
}
