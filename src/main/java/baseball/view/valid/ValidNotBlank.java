package baseball.view.valid;

import java.util.List;

import static baseball.constant.ExceptionConstant.BLANK_ERROR;

public class ValidNotBlank implements ValidInputView{
    @Override
    public void validate(List<String> inputStringList) {
        if (inputStringList.isEmpty()) {
            throw new IllegalArgumentException(BLANK_ERROR.message());
        }
    }
}
