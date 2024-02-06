package baseball.service;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberCreatorTest {

    @Test
    void 중복되지_않는_랜덤한_숫자_세자리를_생성합니다(){
        //given
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

        //when
        List<Integer> number = randomNumberCreator.createNumber();
        Stream<Integer> distinct = number.stream().distinct();

        //then
        assertThat(number.size()).isEqualTo(3);
        assertThat(distinct.count()).isEqualTo(3L);
    }
    
    @Test
    void 생성되는_숫자의_범위는_1에서9_입니다(){
        //given
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

        //when
        List<Integer> number = randomNumberCreator.createNumber();

        //then
        assertThat(number.get(0)).isLessThan(10);
        assertThat(number.get(0)).isGreaterThan(0);
        assertThat(number.get(1)).isLessThan(10);
        assertThat(number.get(1)).isGreaterThan(0);
        assertThat(number.get(2)).isLessThan(10);
        assertThat(number.get(2)).isGreaterThan(0);
    }
}