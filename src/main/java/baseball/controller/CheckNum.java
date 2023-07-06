package baseball.controller;



import baseball.model.ValueRecord;

import java.util.List;

public class CheckNum {

    public static String checkNum(ValueRecord valueRecord) {
        int[] randomNum = valueRecord.randomNum;
        int[] userNum = valueRecord.userNum;
        int cnt = 0;
        int strike = 0, ball = 0;

        // 일치하는게 있는지 확인 없으면 낫싱
        for(int i = 0; i < randomNum.length; i++){
            for(int j = 0; j < userNum.length; j++){
                if(randomNum[i] == userNum[j]) cnt++;
            }
        }
        if(cnt == 0) return "낫싱";

        // 스트라이크 갯수 체크하기
        for(int i = 0; i < 3; i++){
            if(randomNum[i] == userNum[i])
                strike++;
        }

        // 볼의 개수 = cnt - 스트라이크 갯수
        ball = cnt - strike;

        if(strike == 0) return ball + "볼";
        if(ball == 0) return strike + "스트라이크";
        return ball + "볼 " + strike +"스트라이크";
    }
}
