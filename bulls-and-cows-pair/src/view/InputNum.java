package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputNum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> inputNum() throws IOException {
        System.out.print("숫자를 입력해주세요");

        String num = br.readLine();

        List<Integer> userNum = new ArrayList<>();
        userNum.add(num.charAt(0) - '0');
        userNum.add(num.charAt(1) - '0');
        userNum.add(num.charAt(2) - '0');

        return userNum;
    }
}
