package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int readInput() {
        String input = Console.readLine();
        return Integer.parseInt(input);
    }
}
