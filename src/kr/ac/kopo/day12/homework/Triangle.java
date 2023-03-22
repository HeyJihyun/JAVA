package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class Triangle extends Shape{
	ScannerUtil sc = new ScannerUtil();
	public Triangle() {
		int width = sc.nextInt("밑변을 입력하세요 : ");
		int height = sc.nextInt("높이를 입력하세요 : ");
		
		setWidth(width);
		setHeight(height);
		calArea();
	}
	
	@Override
	public void calArea() {
		super.area = width * height / 2.0;
	}
	
	@Override
	public void info() {
		System.out.print("밑변" + width + ", 높이" + height +"의 삼각형의 ");
		super.info();
	}
	



}
