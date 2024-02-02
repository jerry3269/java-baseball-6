package baseball.constant;

public enum MessageConstant {
    INIT_GAME_MESSAGE("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MESSAGE("숫자를 입력해주세요 : "),
    NOTHING("낫싱"),
    STRIKE("스트라이크 "),
    BALL("볼 ");

    private String message;

    MessageConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
