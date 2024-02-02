package baseball.constant;

public enum MessageConstant {
    INIT_GAME_MESSAGE("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MESSAGE("숫자를 입력해주세요 : "),
    THREE_STRIKE_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    NEW_GAME_OR_NOT_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
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
