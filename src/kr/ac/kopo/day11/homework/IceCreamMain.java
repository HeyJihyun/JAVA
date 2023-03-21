package kr.ac.kopo.day11.homework;

import java.util.Scanner;


public class IceCreamMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ScannerUtil sc = new ScannerUtil();
		
		boolean bool = true;
		
		do {
			
			Order order = new Order(); //order 클래스 생성
					
			IceCream[] iceArr = order.order(sc.nextInt("아이스크림 몇개 구입할래 ? ")); // 아이스크림 구매 (아이스크림 배열로 생성)
			
			System.out.println("< 총 "+ iceArr.length + "개의 아이스크림 구매 정보 출력 >");
			System.out.println("번호 \t 아이스크림명 \t 아이스크림가격");
			for(IceCream ice  : iceArr) { // 아이스크림 정보 출력
				ice.info();
			}
			System.out.println("총합 : " + order.odTotal(iceArr) + "원"); // 아이스크림[] total 출력
			
			
			System.out.println("계속구매할래?(Y/N)");
			
			bool = s.nextLine().equalsIgnoreCase("y"); // y = 더 구매 다른 문자 누를 시 프로그램 종료
		}while(bool);
		
		
		System.out.println("총 " + Order.odCnt + "번의 구매정보 발생");
		System.out.println("총계 : " + Order.total + "원");	
		
	}

}
