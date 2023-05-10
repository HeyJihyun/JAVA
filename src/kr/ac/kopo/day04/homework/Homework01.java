package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("반지름 입력 : ");

        int radius = sc.nextInt();
        double pi = 3.141592;

        System.out.printf("원넓이 : %.4f ", pi * radius * radius);
        System.out.printf("원둘레 : %.4f", pi * radius * 2);
    }

}
