package kr.ac.kopo.day12.homework;

//Shape의 하위 클래스
public class Rectangle extends Shape {

    // 디폴트 클래스 width, height 입력, area 초기화 및 계산
    public Rectangle() {
        int width = sc.nextInt("가로의 길이를 입력하세요 : ");
        int height = sc.nextInt("세로의 길이를 입력하세요 : ");

        setWidth(width);
        setHeight(height);
        calArea();
    }

    // 직사각형 정보 출력
    @Override
    public void info() {
        System.out.print("가로" + width + ", 세로" + height + "의 직사각형의 ");
        super.info();
    }

}
