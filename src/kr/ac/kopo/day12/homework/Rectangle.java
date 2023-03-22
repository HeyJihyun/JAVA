package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class Rectangle extends Shape {
	ScannerUtil sc = new ScannerUtil();
	public Rectangle() {
		int width = sc.nextInt("가로의 길이를 입력하세요 : ");
		int height = sc.nextInt("세로의 길이를 입력하세요 : ");
		
		setWidth(width);
		setHeight(height);
		calArea();
	}
	
	@Override
	public void info() {
		System.out.print("가로" + width + ", 세로" + height +"의 직사각형의 ");
		super.info();
	}
	

}
