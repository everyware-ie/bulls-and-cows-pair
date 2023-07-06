package baseball.view;

import baseball.controller.CheckNum;
import baseball.controller.CreateRandomNum;
import baseball.controller.InputUserNum;
import baseball.model.ValueRecord;

import static camp.nextstep.edu.missionutils.Console.*;
import static java.lang.System.exit;

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

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        progress();
    }

    public void progress() {
        //모델 생성
        ValueRecord valueRecord = new ValueRecord();

        //랜덤 숫자 생성 및 모델에 저장
        valueRecord.randomNum = CreateRandomNum.createNum();

        //랜덤 숫자 확인
        for(int i=0; i<3; i++){
            System.out.print(valueRecord.randomNum[i]+"");
        }
        System.out.println();

        //유저 숫자 입력 및 결과 출력
        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            // 유저 숫자 입력 받아오기
            valueRecord.userNum = InputUserNum.inputNum();

            // 유저 숫자와 랜덤 숫자 비교
            valueRecord.result = CheckNum.checkNum(valueRecord);

            // 비교 결과 출력
            System.out.println(valueRecord.result);

            // 맞췄을 때
            if (valueRecord.result.equals("3스트라이크")) {
                // 게임 종료
                finish();
                break;
            }
        }
        finish();
    }

    //게임 종료 후 재시작 여부
    public void finish() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");

        Integer restart = Integer.parseInt(readLine());
        if (restart == 1) {
            Game newGame = new Game();
            newGame.start();
        } else {
            System.out.println("게임을 종료합니다.");
            exit(0);
        }
    }
}
