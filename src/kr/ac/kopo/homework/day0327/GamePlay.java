package kr.ac.kopo.homework.day0327;

import java.util.Scanner;

public class GamePlay {
    private static int win;
    private static int lose;
    private static int draw;

    // 게임선택
    public void selectGame() {
        System.out.println("게임을 선택하세요");
        System.out.println("A. 가위바위보\n" + "B. 주사위 값 맞추기\n" + "C. 종료 ");
        char select = select();

        // 'C' 선택시 게임 종료 및 게임전적 출력
        if (select == 'C') {
            System.out.println("당신의 게임 전적은 " + win + "승 " + lose + "패 " + draw + "무입니다. ");
            return;
        }

        playGame(select);

    }

    // 선택한 게임 실행
    public void playGame(char select) {
        int you = 0; // 플레이어 선택 숫자
        Game game = null;

        switch (select) {
        case 'A': // 가위바위보
            game = new ScissorsRockPaper();
            System.out.println("가위바위보 게임입니다.");
            System.out.println("가위바위보중 하나를 선택하세요. \n" + "(1:가위, 2:바위, 3보) ");
            you = select(3); // 1~3까지 선택 가능
            break;
        case 'B':
            game = new Dice();
            System.out.println("주사위 값 맞추기 게임입니다. ");
            System.out.println("주사위을 선택하세요(1~6값 중 하나) ");
            you = select(6); // 1~6까지 선택가능
        }
        // 게임실행
        int result = game.startGame(you);

        // 승점 계산
        if (result == 1)
            win++;
        else if (result == 0)
            draw++;
        else
            lose++;

        // 게임선택으로 돌아가기
        selectGame();
    }

    // 'A'~'C' 선택 범위 메소드
    public char select() {
        char select;
        Scanner sc = new Scanner(System.in);
        do {
            select = sc.nextLine().charAt(0);
            if (select < 'A' || select > 'C')
                System.out.println("다시 입력하세요.");
            else
                break;
        } while (true);

        return select;
    }

    // 1~max 선택 범위 메소드
    public int select(int max) {
        int select;
        Scanner sc = new Scanner(System.in);
        do {
            select = sc.nextInt();
            if (select < 1 || select > max)
                System.out.println("다시 입력하세요.");
            else
                break;
        } while (true);

        return select;
    }

}
