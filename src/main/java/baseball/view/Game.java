package baseball.view;

import baseball.controller.CheckNum;
import baseball.controller.CreateRandomNum;
import baseball.controller.CreateUserNum;
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
        ValueRecord valueRecord = new ValueRecord();
        valueRecord.randomNum = CreateRandomNum.createNum();
        System.out.println(valueRecord.randomNum);

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            valueRecord.userNum = CreateUserNum.inputNum();
            valueRecord.result = CheckNum.checkNum(valueRecord);

            System.out.println(valueRecord.result);

            // 맞췄을 때
            if (valueRecord.result == "3스트라이크") {
                // 게임 종료
                break;
            }
        }
        finish();
    }

    public void finish() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");

        Integer restart = Integer.parseInt(readLine());
        if (restart == 1) {
            Game newGame = new Game();
            newGame.start();
        }

        else exit(0);
    }
}
