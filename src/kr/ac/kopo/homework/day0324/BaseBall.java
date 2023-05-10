package kr.ac.kopo.homework.day0324;

public class BaseBall {
    private static int out;
    private static int chance = 6;

    public void playGame() { // 게임 시작 시 랜덤 3자리 생성 및 게임 시작
        RandomNum r = new RandomNum();
        playGame(r);
    }

    public void playGame(RandomNum r) {

        System.out.print("세 자리 숫자를 입력해 주세요 : ");
        // 플레이어 넘버 생성
        PlayerNum p = new PlayerNum();

        // 랜덤no와 플레이어no 비교 메소드 실행 (strike 횟수 반환)
        int strike = conpareNum(r.getRnums(), p.getPnums());

        // 스트라이크가 3일 시 성공
        if (strike == 3) {
            System.out.print("축하합니다!");
            r.rnumPrint();
            return;
        }

        // 잔여 횟수 출력
        System.out.println(--chance + "회 남았습니다.\n");
        ;

        // 횟수가 0 이거나 out이 3이면 게임종료, 아니면 게임 재실행
        if (chance == 0 || out == 3) {
            r.rnumPrint();
        } else {
            playGame(r);
        }
    }

    // 랜덤no, 플레이어no 비교 메소드
    public int conpareNum(int[] r, int[] p) {

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < r.length; i++) {
            // 랜덤no 플래이어no의 위치도 같으면 strike 증가,
            if (r[i] == p[i]) {
                strike++;
            } else {
                for (int j = 0; j < p.length; j++) {
                    // 숫자만 동일하면 ball 증가
                    if (r[i] == p[j]) {
                        ball++;
                    }
                }
            }
        }

        // 하나의 숫자도 동일하지 않을 경우 out 증가
        if (strike == 0 && ball == 0)
            out++;

        // strike, ball, out 정보 출력
        System.out.println(strike + " strike, " + ball + " ball, " + out + " out");

        // strike 값 반환
        return strike;
    }

}
