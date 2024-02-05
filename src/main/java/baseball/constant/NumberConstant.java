package baseball.constant;

public enum NumberConstant {
    MAX_RANDOM_NUMBER("9",9),
    MIN_RANDOM_NUMBER("1",1),
    CREATE_NUMBER_DIGIT("3",3),
    MIN_RESTART_TOKEN("1",1),
    MAX_RESTART_TOKEN("2",2),
    RESTART_TOKEN_DIGIT("1",1),
    ZERO("0", 0),
    ONE("1", 1),
    RESTART("1", 1),
    END("2", 2);

    private String stringValue;
    private int intValue;

    NumberConstant(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }

    public String stringValue() {
        return stringValue;
    }

    public int intValue() {
        return intValue;
    }
}
