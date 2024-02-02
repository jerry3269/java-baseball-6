package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.NumberConstant.*;

public class RandomNumberCreator {
    public List<Integer> createNumber() {
        List<Integer> createNumber = new ArrayList<>();

        while (createNumber.size() < MAX_CREATE_NUMBER.value()) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER.value(), MAX_RANDOM_NUMBER.value());
            if (!createNumber.contains(randomNumber)) {
                createNumber.add(randomNumber);
            }
        }

        return createNumber;
    }
}
