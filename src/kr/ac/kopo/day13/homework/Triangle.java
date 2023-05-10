package kr.ac.kopo.day13.homework;

public class Triangle extends Shape {

    Triangle() {
        this(sc.nextInt("밑변을 입력하세요:"), sc.nextInt("높이를 입력하세요 : "));
    }

    Triangle(int width, int height) { // Shape 클래스의 각각 매개변수 초기화
        setWidth(width);
        setHeight(height);
        setArea();
        setName("삼각형");
    }

    @Override
    public double calArea() { // 면적 계산 메소드
        return getWidth() * (double) getHeight() / 2;
    }

    @Override
    public void info() { // 정보 출력 메소드
        System.out.printf("밑변%d, 높이%d의 %s의 넓이는 %.2f 입니다.\n", getWidth(), getHeight(), getName(), getArea());

    }

}
