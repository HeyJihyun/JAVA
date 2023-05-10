package kr.ac.kopo.day10;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    /**
     * 디폴트 생성자 - 매개변수 값이 없을 시 기본값 : 1
     */
    Calculator() {
        this(12, 1);
    }

    Calculator(int num1) {
        this(num1, 1);
    }

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * 두개 정수의 사칙연산을 출력하는 메소드
     * 
     * @param num1 정수1
     * @param num2 정수2
     */
    void cal() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
    }

    /**
     * 두개 정수의 소수여부 확인하는 메소드
     * 
     * @param num1
     * @param num2
     */
    void primeCheck() {
        boolean primeNum1 = true;
        for (int i = 2; i < num1; i++) { // 1과 num1이 아닌 다른 수 나눠서 나머지가 0 이면 소수 아님
            if (num1 % i == 0)
                primeNum1 = false;
        }
        boolean primeNum2 = true;
        for (int i = 2; i < num2; i++) { // 1과 num1이 아닌 다른 수 나눠서 나머지가 0 이면 소수 아님
            if (num2 % i == 0)
                primeNum2 = false;
        }
        System.out.println(num1 + "소수체크 : " + primeNum1);
        System.out.println(num2 + "소수체크 : " + primeNum2);
    }

}
