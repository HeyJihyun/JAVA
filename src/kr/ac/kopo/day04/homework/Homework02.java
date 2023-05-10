package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("물건값을 입력 : ");
        int goods = sc.nextInt(); // 물건값 변수

        System.out.printf("지불한 돈 입력 : ");
        int money = sc.nextInt(); // 지불한 돈 변수

        int cMoney = money - goods;
        ; // 거스름돈

        if (cMoney < 0) {
            System.out.println(-cMoney + "원이 부족합니다.");
        } else {

            System.out.println("거스름돈 : " + cMoney + "원");

            // 잔돈 단위 변수
            int cheon = cMoney / 1000;
            int obaeg = (cMoney % 1000) / 500;
            int baeg = (cMoney % 1000) / 100 - obaeg;
            int osib = (cMoney % 100) / 50;
            int sib = (cMoney % 100) / 10 - osib;

            // 잔돈 단위 출력
            System.out.printf("%4d원 : %d개\n", 1000, cheon);
            System.out.printf("%4d원 : %d개\n", 500, obaeg);
            System.out.printf("%4d원 : %d개\n", 100, baeg);
            System.out.printf("%4d원 : %d개\n", 50, osib);
            System.out.printf("%4d원 : %d개\n", 50, sib);
        }

    }

}
