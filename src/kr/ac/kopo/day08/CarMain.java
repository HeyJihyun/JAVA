package kr.ac.kopo.day08;

// 실행 클래스
public class CarMain {
    public static void main(String[] args) {

        Car c = new Car();

        c.model = "소나타";
        c.price = 3000;

        Car c2 = new Car();

        c2.model = "모닝";
        c2.price = 1900;

        System.out.println("모델명 : " + c.model + ", 가격 : " + c.price + "만 원");
        System.out.println("모델명 : " + c2.model + ", 가격 : " + c2.price + "만 원");
        System.out.println("");

    }

}
