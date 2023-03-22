package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class Circle extends Shape {
	ScannerUtil sc = new ScannerUtil();
	public Circle() {
		int width = sc.nextInt("반지름의 길이를 입력하세요 : ");
		
		setWidth(width);
		calArea();
	}
	
	@Override
	public void calArea() {
		super.area = width * width * Math.PI;
	}
	
	@Override
	public void info() {
		System.out.print("반지름 " + width + "인 원의 ");
		super.info();
	}
	
}
