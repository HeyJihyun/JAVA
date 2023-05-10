package kr.ac.kopo.day13.homework;

import kr.ac.kopo.day11.homework.ScannerUtil;

public abstract class Shape {

    protected static ScannerUtil sc = new ScannerUtil();

    private int width; // 각 도형의 가로변 또는 반지름
    private int height; // 각 도형의 높이
    private double area; // 각 도형의 면적
    private String name; // 각 도형의 이름

    public abstract double calArea(); // 넓이 계산 메소드(추상)

    public abstract void info(); // 정보 출력 메소드(추상)

    public void setName(String name) { // name 변수 설정 메소드
        this.name = name;
    }

    public void setWidth(int width) { // width 변수 설정 메소드
        this.width = width;
    }

    public void setHeight(int height) { // height 변수 설정 메소드
        this.height = height;
    }

    public void setArea() { // area 변수 설정 메소드, calArea() 메소드 실행
        area = calArea();
    }

    public int getWidth() { // width변수 호출 메소드
        return width;
    }

    public int getHeight() { // height 변수 호출 메소드
        return height;
    }

    public double getArea() { // area 변수 호출 메소드
        return area;
    }

    public String getName() { // name 변수 호출 메소드
        return name;
    }
}
