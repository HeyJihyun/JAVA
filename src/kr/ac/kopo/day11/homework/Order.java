package kr.ac.kopo.day11.homework;

import java.util.Scanner;

//주문 클래스

public class Order {
    Scanner s = new Scanner(System.in);
    ScannerUtil sc = new ScannerUtil();

    static int odCnt; // 주문 횟수
    static int total; // 주문 총합

    Order() {
        odCnt++; // 주문할대마다 횟수 증가
    }

    IceCream[] order(int order) { // 아이스크림 주문 갯수 크기의 아이스크림 배열로 반환
        IceCream[] iceArr = new IceCream[order];

        for (int i = 0; i < order; i++) {
            System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 정보 입력 ***");

            System.out.print("아이스크림명 : ");
            String iceName = s.nextLine();

            int icePrice = sc.nextInt("아이스크림 가격 : ");

            iceArr[i] = new IceCream(i + 1, iceName, icePrice); // 아이스크림 객체 생성

            total += icePrice;

            System.out.println();
        }
        return iceArr; // 아이스크림 배열 반환
    }

    int odTotal(IceCream[] iceArr) { // 주문한 아이스크림 가격의 total 반환
        int total = 0;
        for (IceCream ice : iceArr) {
            total += ice.price;
        }
        return total;
    }

}