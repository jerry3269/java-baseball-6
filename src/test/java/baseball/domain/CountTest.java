package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CountTest {

    @Test
    void 생성된_숫자와_추측한_숫자가_같다면_스트라이크_값이_3인지_확인(){
        //given
        List<Integer> createNumber = new ArrayList<>();
        List<Integer> guessNumber = new ArrayList<>();

        createNumber.add(1);
        createNumber.add(2);
        createNumber.add(3);

        guessNumber.add(1);
        guessNumber.add(2);
        guessNumber.add(3);


        //when
        Count count = Count.valueOf(createNumber, guessNumber);

        //then
        assertThat(count.isOut()).isTrue();
    }

    @Test
    void 생성된_숫자와_추측한_숫자가_다르다먼_스트라이크와_볼의_개수가_맞는지_확인(){
        //given
        List<Integer> createNumber = new ArrayList<>();
        List<Integer> guessNumber = new ArrayList<>();

        createNumber.add(1);
        createNumber.add(2);
        createNumber.add(3);

        guessNumber.add(3);
        guessNumber.add(2);
        guessNumber.add(1);


        //when
        Count count = Count.valueOf(createNumber, guessNumber);
        String string = count.toString();

        //then
        assertThat(string).isEqualTo("2볼 1스트라이크 ");
    }
}
