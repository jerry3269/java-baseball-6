package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.NumberConstant.*;

public class RandomNumberCreator {
    public List<Integer> createNumber() {
        List<Integer> createNumber = new ArrayList<>();

        while (createNumber.size() < MAX_CREATE_NUMBER.intValue()) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER.intValue(), MAX_RANDOM_NUMBER.intValue());
            if (!createNumber.contains(randomNumber)) {
                createNumber.add(randomNumber);
            }
        }

        return createNumber;
    }
}
