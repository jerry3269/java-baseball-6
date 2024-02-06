package baseball.view;

import baseball.view.valid.InputViewValidator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RestartTokenTest extends NsTest {

    private boolean restartToken;

    @Test
    void 숫자가_아닌_값은_들어올_수_없습니다(){
        assertThatThrownBy(() -> run("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 한_자리_숫자만_입력할_수_있습니다(){
        assertThatThrownBy(() -> run("12"))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> run("123"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자는_1또는_2여야_합니다(){
        assertThatThrownBy(() -> run("3"))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> run("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 올바른_숫자를_입력하면_통과합니다(){
        run("1");
        assertThat(restartToken).isTrue();
        run("2");
        assertThat(restartToken).isFalse();
    }

    @Override
    protected void runMain() {
        InputView inputView = new InputView(new InputViewValidator());
        restartToken = inputView.readRestartToken();
    }
}
