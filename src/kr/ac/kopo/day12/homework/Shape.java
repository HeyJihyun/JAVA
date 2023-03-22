package kr.ac.kopo.day12.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;
/**
 * 각각 도형들의 상위 클래스
 * @author User
 *
 */
public class Shape {
	
	ScannerUtil sc = new ScannerUtil();
	int width;
	int height;
	double area;
	
	// 디폴트 생성자
	public Shape(){
		
	}
	
	// 매개변수 두개 생성자
	public Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	
	// width 초기화 메소드
	public void setWidth(int width) {
		this.width = width;
	}
	
	// height 초기화 메소드
	public void setHeight(int height) {
		this.height = height;
	}
	
	// area 초기화 메소드
	public void setArea(double area) {
		this.area = area;
	}
	
	// area 계산 메소드
	public void calArea() {
		area = width * height;
	}
	
	// 넓이 출력 메소드
	public void info() {
		System.out.println("넓이는" + area + "입니다.");
	}

}
