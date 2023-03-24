package kr.ac.kopo.day14.homework02;

public abstract class Figure implements AreaPrintable {
	
	private double area;

	//getter
	public double getArea() {
		return this.area;
	}
	
	//setter
	protected void setArea(double area) {
		this.area = area;
	}

	
}
