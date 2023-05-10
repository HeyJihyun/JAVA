package kr.ac.kopo.day10.exam;

import java.util.Scanner;

/**
 * 연습용 간단한 메소드들을 모아놓은 클래스
 * 
 * @author User
 * @version 1.0
 * @since 23.03.20
 *
 */

public class MethodExam {
    /**
     * 호출자 메소드에서 받아온 두개의 정수 사이의 총합을 반환하는 메소드
     * 
     * @param num1 첫번째 정수, 총합의 시작값
     * @param num2 두번째 정수, 총합의 종료값
     * @return num1~num2 사이의 총합
     * 
     * @ : 어노테이션(컴퓨터가 해석할 수 있는 주석
     */

    /**
     * 
     * @param num1
     * @param num2
     * @return total
     */

    public int getTotal(int num1, int num2) {
        int total = 0;

        while (num1 <= num2)
            total += num1++;

//		for(int i = num1; i <= num2; i++) {
//			total += i;
//		}
        return total;
    }

    /**
     * 구구단 중 입력한값의 단을 출력
     * 
     * @param dan 입력한 단
     */
    public void printGugudan(int dan) {
        System.out.println("*** " + dan + "단 ***");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }

    /**
     * 전체 구구단 출력
     */
    public void printGugudan() {

        printGugudan(2, 9);
        /*
         * for (int dan = 2; dan <= 9; dan++) { this.printGugudan(dan); // this - 같은
         * 클래스에 있는 경우 생략 가능. System.out.println(); }
         */
    }

    /**
     * 키보드로 단을 입력받아 반환
     * 
     * @return 입력받은 단
     */
    public int getDan() {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        return dan;
    }

    /**
     * 시작단 ~ 종료단까지 구구단 출력
     * 
     * @param sartDan 시작단
     * @param endDan  구구단
     */
    public void printGugudan(int startDan, int endDan) {
        for (int dan = startDan; dan <= endDan; dan++) {
            printGugudan(dan);
            System.out.println();
        }
    }

}
