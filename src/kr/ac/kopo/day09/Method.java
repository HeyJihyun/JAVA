package kr.ac.kopo.day09;

public class Method {

    void call() {
        System.out.println("call() 메소드 호출...");
    }

    // 메소드 오버로딩(Overloading) : 같은 클래스 안에 같은 이름의 메소드가 지정되어있는데 매개변수가 다름
    void call(int a) {
        System.out.println("call(int) 메소드 호출...");
    }

    void call(double a) {
        System.out.println("call(double) 메소드 호출...");
    }

    void call(String a, int b) {
        System.out.println("call(String, int) 메소드 호출...");
    }

}
