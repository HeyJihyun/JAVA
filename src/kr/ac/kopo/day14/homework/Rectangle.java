package kr.ac.kopo.day14.homework;

public class Rectangle extends PlainFigure{

	protected static String name;
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		super(width, height);
		double area = width * height ;
		setArea(area);
		name= width == height ? "정사각형" : "직사각형";
	}
	
	@Override
	public void printArea() {
		System.out.printf("가로 %d, 세로 %d인 %s의 넓이 : %.0f\n", getWidth(), height, name, getArea());
	}


}
