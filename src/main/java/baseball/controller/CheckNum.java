package baseball.controller;



import baseball.model.ValueRecord;

import java.util.List;

public class CheckNum {

    public static String checkNum(ValueRecord valueRecord) {

        List<Integer> randomNum = valueRecord.randomNum;
        List<Integer> userNum = valueRecord.userNum;
        int cnt = 0;
        int strike = 0, ball = 0;

        // 일치하는게 있는지 확인 없으면 낫싱
        for(int i = 0; i < 3; i++) {
            if(randomNum.contains(userNum.indexOf(i))) {
                cnt++;
            }
        }
        if(cnt == 0) return "낫싱";

        // 스트라이크 갯수 체크하기
        for(int i = 0; i < 3; i++) {
            if(randomNum.indexOf(i) == userNum.indexOf(i))
                strike++;
        }

        // 볼의 개수 = cnt - 스트라이크 갯수
        ball = cnt - strike;

        if(strike == 0) return ball + "볼";
        if(ball == 0) return strike + "스트라이크";
        return ball + "볼 " + strike +"스트라이크";
    }
}
