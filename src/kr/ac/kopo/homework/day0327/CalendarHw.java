package kr.ac.kopo.homework.day0327;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarHw {
	private static Calendar c = Calendar.getInstance();
	private static Scanner sc = new Scanner(System.in);
	
	
	// 설정한 년도 1~12월 출력 메소드
	public void CalendarPrint(int year) {
		for(int i = 1; i <= 12; i++) { // 1월 부터 12월 까지
			CalendarPrint(year, i); // year년 각 달 출력
		}
	}
	
	
	// 설정한 달의 출력 메소드
	public void CalendarPrint(int year, int month) {
		
		c.set(year, month-1, 1); // year년 month월 1일 로 설정
		System.out.println("\t\t    " + year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastdate = c.getActualMaximum(Calendar.DATE); // 설정한 달의 마지막날
		int day = c.get(Calendar.DAY_OF_WEEK); // 시작 요일
		
		for(int i = 1; i < day; i++) { // 비어있는날 
			System.out.print("\t");
		}
		
		for(int i = 1; i <= lastdate; i++, day++) { // 1일 부터 말일까지 
			System.out.print(i + "\t"); 
			if(day == 7) { // 토요일이면 엔터 일요일부터 다시 시작
				System.out.println();
				day = 0;
			}
		}
		System.out.println("\n");
	}
	
	// 달력선택 메소드
	public void calendarSelect() {
		System.out.println("원하는 항목을 선택하세요(1.특정년도  2.특정월  3. 종료)");
		int select = select(3);//1~3만 선택 가능
		if(select == 3) return;
		calendarSelect(select);
	}
	
	public void calendarSelect(int select) {
		System.out.print("년도를 선택하세요(1~2999) : ");
		int year = select(2999); // 1~2999년까지 검색 가능
		switch(select) {
		case 1 :
			CalendarPrint(year);
			break;
		case 2 :
			System.out.println("월을 선택하세요(1~12)");
			int month = select(12); // 1~12만 선택 가능
			CalendarPrint(year, month);
		}
		calendarSelect();
	}
	
	// 1~max 선택 범위 메소드
	public int select(int max) {
		int select;
		Scanner sc = new Scanner(System.in);
		do {
			select = sc.nextInt();			
			if(select < 1 || select > max) 
				System.out.println("다시 입력하세요.");				
			else break;
		}while(true);
		
		return select;
	}
	
}
