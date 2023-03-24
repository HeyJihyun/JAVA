package kr.ac.kopo.day13.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class AreaCal {

	public void areaCal() {

		ScannerUtil sc = new ScannerUtil();
		
		int select; // 도형 선택 번호
		System.out.println("1. 삼각형  2. 정사각형  3. 직사각형  4. 원");
		select = sc.nextInt("면적을 구할 도형을 선택하세요 : ");
		
		// 도형클래스(상위클래스) 변수
		Shape shape = null;
		
		switch (select) {
		case 0:
			break; // 0 선택시 프로그램 종료
		case 1: // 1번 선택시 삼각형 클래스(하위)
			shape = new Triangle();
			break;
		case 2: // 2번 선택시 정사각형 클래스(하위)
			shape = new Square();
			break;
		case 3: // 3번 선택시 직사각형 클래스(하위)
			shape = new Rectangle();
			break;
		case 4: // 4번 선택시 원 클래스(하위)
			shape = new Circle();
			break;
		default: // 그 외 입력시 잘못입력
			System.out.println("잘 못 입력하셨습니다.");
		}

		if(shape != null) {
			shape.info();			
		}
		
	}
}
