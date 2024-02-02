package baseball.domain;

import java.util.List;

import static baseball.constant.MessageConstant.*;
import static baseball.constant.NumberConstant.*;

public class Count {
    private int strike;
    private int ball;
    private final List<Integer> createNumber;
    private final List<Integer> guessNumber;

    private Count(int strike, int ball, List<Integer> createNumber, List<Integer> guessNumber) {
        this.createNumber = createNumber;
        this.guessNumber = guessNumber;
        this.calculate();
    }

    //API
    public static Count valueOf(List<Integer> createNumber, List<Integer> guessNumber) {
        return new Count(ZERO.intValue(), ZERO.intValue(), createNumber, guessNumber);
    }

    public boolean isOut() {
        return strike == MAX_CREATE_NUMBER.intValue();
    }

    //내부 구현
    private void calculate() {
        for (int i = 0; i < createNumber.size(); i++) {
            for (int j = 0; j < guessNumber.size(); j++) {
                compareIndex(i, j);
            }
        }
    }

    private void compareIndex(int i, int j) {
        if (i == j) {
            if (createNumber.get(i) == guessNumber.get(j)) this.strike();
        }

        if (i != j) {
            if (createNumber.get(i) == guessNumber.get(j)) this.ball();
        }
    }

    private void strike() {
        this.strike += ONE.intValue();
    }

    private void ball() {
        this.ball += ONE.intValue();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if(strike == 0 && ball == 0) {
            return stringBuilder.append(NOTHING.message()).toString();
        }
        if (strike == 0) {
            return stringBuilder.append(ball).append(BALL.message()).toString();
        }
        if (ball == 0) {
            return stringBuilder.append(strike).append(STRIKE.message()).toString();
        }

        return stringBuilder
                .append(ball).append(BALL.message())
                .append(strike).append(STRIKE.message())
                .toString();
    }
}
