package kr.ac.kopo.day14.homework02;

public class HomeworkMain {
	public static void main(String[] args) {
		
		FigureView view = new FigureView();
		view.print(new Circle(4));
		
		
		Figure f= new Square(4);
		f.printArea();
		
		Circle c = new Circle(10);
		c.printArea();
		
		Triangle t = new Triangle(3, 5);
		t.printArea();
		
		Rectangle r = new Rectangle(2,4);
		r.printArea();
		
		f.printArea();
		Square s = new Square(3);
		s.printArea();
		
		r.printArea();
		
		
	}

}
