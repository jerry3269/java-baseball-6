package baseball.constant;

public enum NumberConstant {
    MAX_RANDOM_NUMBER(9),
    MIN_RANDOM_NUMBER(1),
    MAX_CREATE_NUMBER(3);

    private int value;

    NumberConstant(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
