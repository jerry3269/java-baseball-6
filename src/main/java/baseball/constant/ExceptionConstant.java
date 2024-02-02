package baseball.constant;

public enum ExceptionConstant {
    BLANK_ERROR("[ERROR] 빈 칸이 입력되었습니다. 다시 입력해주세요."),
    NO_NUMERIC_ERROR("[ERROR] 숫자가 아닌 값이 입력되었습니다. 다시 입력해주세요."),
    INCLUDE_ZERO_ERROR("[ERROR] 0이 포함되었습니다. 숫자는 1~9의 숫자만 포함할 수 있습니다. 다시 입력해주세요."),
    NUMBER_DUP_ERROR("[ERROR] 중복된 숫자가 입력되었습니다. 다시 입력해주세요."),
    NOT_THREE_DIGIT_ERROR("[ERROR] 숫자는 세 자리여야 합니다. 다시 입력해주세요");

    private String message;

    ExceptionConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
