package baseball.view;

import baseball.view.valid.InputViewValidator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputViewTest extends NsTest {

    @Test
    void 숫자가_아닌_값은_들어올_수_없습니다(){
        assertThatThrownBy(() -> run("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 세_자리_숫자만_입력할_수_있습니다(){
        assertThatThrownBy(() -> run("12"))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> run("1234"))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 중복된_숫자는_입력할_수_없습니다(){
        assertThatThrownBy(() -> run("121"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자는_1부터_9_사이의_숫자여야_합니다(){
        assertThatThrownBy(() -> run("109"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 올바른_숫자를_입력하면_통과합니다(){
        run("123");
    }

    @Override
    protected void runMain() {
        InputView inputView = new InputView(new InputViewValidator());
        inputView.readInput();
    }
}
