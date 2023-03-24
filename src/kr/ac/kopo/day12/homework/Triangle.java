package kr.ac.kopo.day12.homework;

// Shape의 하위 클래스
public class Triangle extends Shape{
	static String name = "삼각형";

	// 디폴트 생성자 width, height 입력, area 계산 및 초기화
	public Triangle() {
		int width = sc.nextInt("밑변을 입력하세요 : ");
		int height = sc.nextInt("높이를 입력하세요 : ");
		
		setWidth(width);
		setHeight(height);
		calArea();
	}
	
	// 넓이 계산 메소드
	@Override
	public void calArea() {
		super.setArea(width * height / 2.0);
	}
	
	
	// 삼각형 정보 출력
	@Override
	public void info() {
		System.out.print("밑변" + width + ", 높이" + height +"의 " + name + "의 ");
		super.info();
	}
	



}
