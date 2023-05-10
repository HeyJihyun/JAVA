package kr.ac.kopo.day13.homework;

public class Rectangle extends Shape {

    Rectangle() {
        this(sc.nextInt("가로의 길이를 입력하세요 : "), sc.nextInt("세로의 길이를 입력하세요 : "));
    }

    Rectangle(int width, int height) { // Shape 클래스의 각각 매개변수 초기화
        setWidth(width);
        ;
        setHeight(height);
        ;
        setArea();
        setName("직사각형");
    }

    @Override
    public double calArea() {// area 계산 메소드
        return getWidth() * getHeight();
    }

    @Override
    public void info() { // 정보출력 메소드
        System.out.printf("가로%d, 세로%d의 %s의 넓이는 %d 입니다.\n", getWidth(), getHeight(), getName(), (int) getArea());

    }

}
