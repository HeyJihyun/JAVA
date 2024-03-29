package kr.ac.kopo.day14.homework02;

public class Triangle extends PlainFigure {

    public Triangle() {

    }

    public Triangle(int width, int heigh) {
        super(width, heigh);
        double area = width * heigh / 2.;
        setArea(area);
    }

    @Override
    public void printArea() {
        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 : %f\n", getWidth(), height, getArea());
    }

}
