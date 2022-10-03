package baseball;

import java.util.Map;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

    }

    private static String inputThreeNumber() {
        System.out.print("숫자를 입력해주세요: ");
        String inputString = readLine();

        if (inputString.length() != 3) {
            throw new IllegalArgumentException();
        }

        return inputString;
    }

    private static String inputContinueOrExit() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료 \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String inputString = readLine();

        if (!inputString.equals("1") && !inputString.equals("2")) {
            throw new IllegalArgumentException();
        }
        return inputString;
    }
}

