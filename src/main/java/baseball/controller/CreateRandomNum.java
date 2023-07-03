package baseball.controller;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CreateRandomNum {

    public static List<Integer> createNum() {
        int i = 0;
        List<Integer> randomNum = new ArrayList<>();

        while (i < 3) {
            if (randomNum.isEmpty()) {
                randomNum.add(pickNumberInRange(1, 9));
                i++;
            } else {
                int tmp = pickNumberInRange(1, 9);
                if (!randomNum.contains(tmp)) {
                    randomNum.add(tmp);
                    i++;
                }
            }
        }

        return randomNum;
    }
}
