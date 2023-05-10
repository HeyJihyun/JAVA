package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 : ");
        int num01 = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int num02 = sc.nextInt();

        String msg = num01 % num02 == 0 ? "배수다" : "배수가 아니다";

        System.out.printf("%d는 %d의 배수 여부 : %s", num01, num02, msg);

        sc.close();
    }

}
