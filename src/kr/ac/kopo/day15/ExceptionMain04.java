package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain04 {
    public static void main(String[] args) {

        System.out.println("====== start ======");

        Random r = new Random();
        int random = r.nextInt(3);

        System.out.println("random : " + random);

        try {
            System.out.println("\t " + 10 / random);

            String str = "hello";
            System.out.println(str.charAt(5));
        } catch (Exception e) { // 모든 예외클래스는 Exception 클래스를 상속(묵시적 형변환)
            e.printStackTrace();
        }

        System.out.println("======  end  ======");

    }

}
