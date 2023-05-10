package kr.ac.kopo.day12.homework;

//Shape의 하위 클래스
public class Circle extends Shape {

    // 디폴트 생성자 반지름입력 및 넓이 계산
    public Circle() {
        int width = sc.nextInt("반지름의 길이를 입력하세요 : ");

        setWidth(width);
        calArea();
    }

    // 넓이 계산 메소드
    @Override
    public void calArea() {
        super.setArea(width * width * Math.PI);
    }

    // 원의 정보 출력
    @Override
    public void info() {
        System.out.print("반지름 " + width + "인 원의 ");
        super.info();
    }

}
