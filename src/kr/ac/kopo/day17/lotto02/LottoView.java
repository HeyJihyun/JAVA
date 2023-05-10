package kr.ac.kopo.day17.lotto02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

        Set<Integer> lottos = new HashSet<>();
        while (lottos.size() < 6) {
            lottos.add(r.nextInt(45) + 1);
            System.out.print("!");
        }

        int i = 0;
        for (int num : lottos) {
            lottoNums[i++] = num;
        }

        Object[] arr = lottos.toArray();

        return lottoNums;
    }

    /*
     * private int[] getLotto() { int[] lottoNums = new int[6]; int[] nums = new int
     * [45];
     * 
     * for(int i =0; i < nums.length; i++) { nums[i] = i+1; }
     * 
     * for(int i =0; i < 6;i++) { int randInx = r.nextInt(45-i); nums[44-i] =
     * nums[randInx]; nums[randInx] = 45-i; } System.arraycopy(nums,
     * nums.length-lottoNums.length, lottoNums, 0, lottoNums.length);
     * 
     * return lottoNums; }
     */
    /*
     * private int[] getLotto() { int[] lottoNums = new int[6];
     * 
     * boolean[] flags = new boolean[45]; // boolean 값은 기본이 false for(int i =0; i <
     * lottoNums.length;) { int random = r.nextInt(45); if(!flags[random]) {
     * lottoNums[i++] = random + 1; flags[random] = true; } else {
     * System.out.print('!'); } } return lottoNums; }
     * 
     */

}
