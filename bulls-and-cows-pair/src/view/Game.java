package view;

import controller.CheckNum;
import controller.CreateRandomNum;
import model.Model;

import java.io.IOException;

public class Game {

    /*
    게임시작
    메시지 출력
    랜덤값 생성
    사용자 입력 받기
    검사
    결과값 출력
    게임 종료 여부 결정
     */

    static Model model = new Model();

    public void start() throws IOException {
        System.out.println("숫자 야구 게임을 시작합니다.");

        progress();
    }

    public void progress() throws IOException {
        // 컴퓨터 랜덤 값 받기
        model.randomNum = CreateRandomNum.createNum();

        model.userNum = InputNum.inputNum();

        model.result = CheckNum.checkNum(model);
        System.out.println(model.result);
    }
}
