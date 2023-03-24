package kr.ac.kopo.day14.homework;

public abstract class Figure {
	
	private double area;

	//getter
	public double getArea() {
		return this.area;
	}
	
	//setter
	protected void setArea(double area) {
		this.area = area;
	}
	
	public abstract void printArea();
	
	
	
}
