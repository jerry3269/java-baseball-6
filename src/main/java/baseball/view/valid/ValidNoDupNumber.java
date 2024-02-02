package baseball.view.valid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static baseball.constant.ExceptionConstant.NUMBER_DUP_ERROR;
import static baseball.constant.NumberConstant.MAX_CREATE_NUMBER;

public class ValidNoDupNumber implements ValidInputView{
    @Override
    public void validate(String input) {
        String[] split = input.split("");
        Set<String> set = new HashSet<>(Arrays.asList(split));
        if(set.size() != MAX_CREATE_NUMBER.intValue()){
            throw new IllegalArgumentException(NUMBER_DUP_ERROR.message());
        }
    }
}
