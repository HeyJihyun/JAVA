package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class AreaMain {
	public static void main(String[] args) {
		ScannerUtil sc = new ScannerUtil();
		
		int select; // 도형 선택 번호
		do {
			System.out.println("1. 삼각형  2. 정사각형  3. 직사각형  4. 원  0. 종료");
			select = sc.nextInt("면적을 구할 도형을 선택하세요 : ");
			
			switch(select){
			case 0 : break; // 0 선택시 프로그램 종료
			case 1: // 1번 선택시 삼각형클래스 생성
				Triangle tri = new Triangle();
				tri.info();
				break;
			case 2: // 2번 선택시 정사각형 클래스 생성
				Square sq = new Square();
				sq.info();
				break;
			case 3: // 3번 선택시 직사각형 클래스 생성
				Rectangle re = new Rectangle();
				re.info();
				break;
			case 4: // 4번 선택시 원 클래스 생성
				Circle cir = new Circle();
				cir.info();
				break;
			default : // 그 외 입력시 잘못입력
				System.out.println("잘 못 입력하셨습니다.");
			}
			System.out.println();
		} while(select != 0);
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
