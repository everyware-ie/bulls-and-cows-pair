package baseball.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputUserNum {
    public static int[] inputNum() {
        String str = readLine();
        int[] userNum = new int[3];
        for(int i = 0; i < 3; i++) {
            Integer tmp = str.charAt(i) - '0';
            userNum[i]=tmp;
        }
        return userNum;
    }
}
