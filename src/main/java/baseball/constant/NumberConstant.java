package baseball.constant;

public enum NumberConstant {
    MAX_RANDOM_NUMBER("9",9),
    MIN_RANDOM_NUMBER("1",1),
    MAX_CREATE_NUMBER("3",3),

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
