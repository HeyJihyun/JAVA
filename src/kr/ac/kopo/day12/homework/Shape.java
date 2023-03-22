package kr.ac.kopo.day12.homework;

public class Shape {
	
	int width;
	int height;
	double area;
	
	public Shape(){
		
	}
	
	public Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public void calArea() {
		area = width * height;
	}
	
	public void info() {
		System.out.println("넓이는" + area + "입니다.");
	}

}
