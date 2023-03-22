package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class Square extends Shape{
	ScannerUtil sc = new ScannerUtil();
	public Square() {
		int width = sc.nextInt("한변의 길이를 입력하세요 : ");
		
		setWidth(width);
		setHeight(width);
		calArea();
	}
	
	@Override
	public void info() {
		System.out.print("가로" + width + ", 세로" + height +"의 정사각형의 ");
		super.info();
	}
	




}
