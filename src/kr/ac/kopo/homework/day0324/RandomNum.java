package kr.ac.kopo.homework.day0324;

import java.util.Random;

public class RandomNum {
    Random r = new Random();

    private int[] rnums = new int[3]; // random number 세자리

    // 생성자 호출 시 중복되지 않는 0~9까지의 숫자 각 자리에 삽입
    public RandomNum() {
        rnums[0] = r.nextInt(10);

        do {
            rnums[1] = r.nextInt(10);
        } while (rnums[0] == rnums[1]);

        do {
            rnums[2] = r.nextInt(10);
        } while (rnums[0] == rnums[2] || rnums[1] == rnums[2]);
    }

    // getter
    public int[] getRnums() {
        return rnums;
    }

    // 랜덤으로 받은 정답 출력 메소드
    public void rnumPrint() {
        System.out.printf("정답은 ");
        for (int rnum : rnums) {
            System.out.print(rnum);
        }
        System.out.println("입니다.");
    }

}
