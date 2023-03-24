package kr.ac.kopo.day13.homework;

public class Circle extends Shape{
	

	Circle(){
		this(sc.nextInt("반지름의 길이를 입력하세요."));
	}
	
	Circle(int radius){ // Shape 클래스의 각각 매개변수 초기화
		setWidth(radius);;
		setArea();
		setName("원");
	}

	@Override
	public double calArea() { // area 계산 메소드
		return getWidth() * getWidth() * Math.PI;
	}

	@Override
	public void info() { // 정보출력 메소드
		System.out.printf("반지름 %d인 %s의 넓이는 %.2f 입니다.\n", getWidth(), getName(), getArea());
		
	}

}
