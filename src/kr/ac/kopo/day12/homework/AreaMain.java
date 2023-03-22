package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class AreaMain {
	public static void main(String[] args) {
		ScannerUtil sc = new ScannerUtil();
		System.out.println("1. 삼각형  2. 정사각형  3. 직사각형  4. 원 ");
		int shape = sc.nextInt("면적을 구할 도형을 선택하세요 : ");
		
		switch(shape){
		case 1: 
			Triangle tri = new Triangle();
			tri.info();
			break;
		case 2:
			Square sq = new Square();
			sq.info();
			break;
		case 3:
			Rectangle re = new Rectangle();
			re.info();
			break;
		case 4:
			Circle cir = new Circle();
			cir.info();
			break;
		default :
		}
		
		
	}

}
