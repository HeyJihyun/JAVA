package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class HomeworkMain06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10]; // nums[0] ~ nums[9]

        for (int i = 0; i < nums.length; i++) {
            System.out.print("num " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        String[] msg = { "짝수", "홀수" };

        char[] titles = { '짝', '홀' };
        for (int mod = 0; mod < 2; mod++) {
            System.out.printf(" << %s >> \n ", msg[mod]);
            for (int num : nums) {
                if (num % 2 == mod) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        /*
         * System.out.println("< 짝수 > "); for(int i = 0; i< nums.length; i++) {
         * if(nums[i] % 2 == 0) { System.out.print(nums[i] + " "); } }
         * System.out.println();
         * 
         * System.out.println("< 홀수 > "); for(int num : nums) { if(num % 2 == 1) {
         * System.out.print(num + " "); } } System.out.println();
         */

    }

}
