package kr.ac.kopo.day17.lotto01;

import java.util.Arrays;
import java.util.Random;

public class LottoView {
    private static Random r = new Random();

    public void start() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("게임수를 입력 : ");
//		int gameCnt = sc.nextInt();
        int gameCnt = 3;
        for (int i = 1; i <= gameCnt; i++) {
            System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
        }
    }

    private int[] getLotto() {
        int[] lottoNums = new int[6];

        boolean[] boolArr = new boolean[45];
        for (boolean bool : boolArr) {
            bool = false;
        }
        int i = 0;
        while (i < 6) {
            int rnum = r.nextInt(45) + 1;
            if (!boolArr[rnum - 1]) {
                boolArr[rnum - 1] = true;
                lottoNums[i] = rnum;
                i++;
            }
        }

        return lottoNums;
    }

    /*
     * private int[] getLotto() { int[] lottoNums = new int[6];
     * 
     * loop : for(int i =0; i < lottoNums.length;) { lottoNums[i] = r.nextInt(45)+1;
     * for(int j = 0; j < i; j++) { if(lottoNums[i] == lottoNums[j]) {
     * System.out.print('!'); continue loop; } } i++; } return lottoNums; }
     * 
     */

    /*
     * private int[] getLotto() { int[] lottoNums = new int[6];
     * 
     * for(int i =0; i < lottoNums.length;) { boolean bool = true; lottoNums[i] =
     * r.nextInt(45)+1; for(int j = 0; j < i; j++) { if(lottoNums[i] ==
     * lottoNums[j]) { bool = false; break; } } if(bool) i++; } return lottoNums; }
     */
}
