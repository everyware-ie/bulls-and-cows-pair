package controller;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNum {

//    public List<Integer> createRandomNum() {
//        List<Integer> computer = new ArrayList<>();
//        while (computer.size() < 3) {
//            int randomNumber = Randoms.pickNumberInRange(1, 9);
//            if (!computer.contains(randomNumber)) {
//                computer.add(randomNumber);
//            }
//        }
//    }

    public static List<Integer> createNum() {
        int idx = 0;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }

        while (idx < 10000) {
            int a = (int) ((Math.random() * 8) + 1);
            int b = (int) ((Math.random() * 8) + 1);

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        List<Integer> randomNum = new ArrayList<>();
        randomNum.add(arr[0]);
        randomNum.add(arr[1]);
        randomNum.add(arr[2]);


        return randomNum;
    }
}
