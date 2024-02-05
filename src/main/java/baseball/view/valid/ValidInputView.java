package baseball.view.valid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.constant.ExceptionConstant.*;
import static baseball.constant.NumberConstant.CREATE_NUMBER_DIGIT;

public class ValidInputView {

    public void validNoDubNumber(List<String> inputStringList) {
        Set<String> set = new HashSet<>(inputStringList);
        if(set.size() != CREATE_NUMBER_DIGIT.value()){
            throw new IllegalArgumentException(NUMBER_DUP_ERROR.message());
        }
    }

    public void validNumeric(List<String> inputStringList) {
        try {
            String input = String.join("", inputStringList);
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NO_NUMERIC_ERROR.message());
        }
    }

    public void validRange(List<String> inputStringList, int start, int end) {
        for (String number : inputStringList) {
            if (notInRange(number, start, end)) {
                throw new IllegalArgumentException(RANGE_ERROR.message());
            }
        }
    }

    private boolean notInRange(String stringNum, int start, int end) {
        int num = Integer.parseInt(stringNum);
        if (num < start || num > end) {
            return true;
        }
        return false;
    }

    public void validDigit(List<String> inputStringList, int n) {
        this.validNumeric(inputStringList);

        if (inputStringList.size() != n) {
            throw new IllegalArgumentException(DIGIT_ERROR.message());
        }
    }
}
