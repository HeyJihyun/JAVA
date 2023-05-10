package kr.ac.kopo.day07;

import java.util.Arrays;
import java.util.Scanner;

/*
 	 키보드로 3개의 실수를 입력받아 출력하는 코드를 작성하시오.
 	 첫번째 실수 : 12.3
 	 두번째 실수 : 66.23
 	 세번째 실수 : 10.673
 	 
 	 <PRINT>
 	 12.3 66.23 10.673
 */
public class ArrayMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 실수 입력 : ");
            arr[i] = sc.nextDouble();
        }

        // 배열의 모든 요소를 출력하는 방식
        /*
         * 1. index를 이용해서 출력(for) 2. 1.5버전의 for문을 이용해서 출력(for 이치) 3. Arrays.toString()
         * 메소드를 이용하여 출력
         * 
         */

        System.out.println("< index를 이용한 출력 >");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        System.out.println("< 1.5버전의 ofr문을 이용한 출력 >");
        for (double i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

    }

}
