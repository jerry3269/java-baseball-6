package baseball.constant;

public enum NumberConstant {
    MAX_RANDOM_NUMBER(9),
    MIN_RANDOM_NUMBER(1),
    CREATE_NUMBER_DIGIT(3),
    MIN_RESTART_TOKEN(1),
    MAX_RESTART_TOKEN(2),
    RESTART_TOKEN_DIGIT(1),
    ZERO(0),
    ONE(1),
    RESTART(1),
    END(2);

    private int value;

    NumberConstant(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
