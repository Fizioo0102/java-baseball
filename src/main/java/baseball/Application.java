package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }
    static void process() {
        if (BaseballGame.playGame()) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int replay = Integer.parseInt(Console.readLine());

            if (!BaseballGame.replayCheck(replay)) {
                System.out.println("게임이 종료되었습니다.");
                return;
            }
            if (BaseballGame.replayCheck(replay)) {
                process();
            }
        }
    }
}

