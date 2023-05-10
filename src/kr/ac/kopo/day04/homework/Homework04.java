package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 4개를 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int max;

        if (num1 > num2 && num1 > num3 && num3 > num4) {
            max = num1;
        } else if (num2 > num3 && num3 > num4) {
            max = num2;
        } else if (num3 > num4) {
            max = num3;
        } else {
            max = num4;
        }

        System.out.println("가장 큰 수 : " + max);
    }
}
