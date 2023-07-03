package baseball.model;


import java.util.List;

public class ValueRecord {
    //컴퓨터 랜덤값, 사용자 입력값, 결과 저장
    // TODO : 한 게임 안에서 랜덤 값은 계속 일정한 반면, userNum은 계속 변하기 때문에 한 객체로 저장하는 게 적절하지 X -> 변경하기!
    public static List<Integer> randomNum;
    public static List<Integer> userNum;
    public static String result;
}
