package baseball.controller;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CreateUserNum {
    public static List<Integer> inputNum() {
        String str = readLine();
        List<Integer> userNum = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            Integer tmp = str.charAt(i) - '0';
            userNum.add(tmp);
        }
        return userNum;
    }
}
