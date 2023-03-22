package kr.ac.kopo.day12.homework;

// Shape 하위 클래스
public class Square extends Shape{

	// 디폴트 생성자 - width입력, area 계산 및 초기화
	public Square() {
		int width = sc.nextInt("한변의 길이를 입력하세요 : ");
		
		setWidth(width);
		setHeight(width);
		calArea();
	}
	
	// 정사각형 정보 출력
	@Override
	public void info() {
		System.out.print("가로" + width + ", 세로" + height +"의 정사각형의 ");
		super.info();
	}
	




}
