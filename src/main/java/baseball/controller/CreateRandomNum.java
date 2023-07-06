package baseball.controller;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CreateRandomNum {
        public static int[] createNum() {
        int i = 0;
        int[] randomNum = new int[3];

        loop : while (i < randomNum.length) { //자바 스터디에서 공유한 알짜배기 스킬
            if (i == 0) {
                randomNum[i++] = pickNumberInRange(1, 9);
            } else {
                int tmp = pickNumberInRange(1, 9);
                for(int j = 0; j < i; j++){
                    if (randomNum[j] == tmp) {
                        continue loop;
                    }
                }
                randomNum[i++] = tmp;
            }
        }

        return randomNum;
    }
}
