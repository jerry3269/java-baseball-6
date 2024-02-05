package baseball.constant;

public enum ExceptionConstant {
    NO_NUMERIC_ERROR("[ERROR] 숫자가 아닌 값이 입력되었습니다. 다시 입력해주세요."),
    RANGE_ERROR("[ERROR] 잘못된 범위의 숫자가 입력되었습니다. 다시 입력해주세요."),
    NUMBER_DUP_ERROR("[ERROR] 중복된 숫자가 입력되었습니다. 다시 입력해주세요."),
    DIGIT_ERROR("[ERROR] 잘못된 자릿수의 숫자가 입력되었습니다. 다시 입력해주세요.");

    private String message;

    ExceptionConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
