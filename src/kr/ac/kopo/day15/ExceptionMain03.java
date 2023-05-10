package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain03 {
    public static void main(String[] args) {

        System.out.println("====== start ======");

        Random r = new Random();
        int random = r.nextInt(3);

        System.out.println("random : " + random);

        try {
            System.out.println("\t " + 10 / random);

            String str = "hello";
            System.out.println(str.charAt(5));
        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        /*
         * } catch(ArithmeticException ae) { ae.printStackTrace(); }
         * catch(StringIndexOutOfBoundsException se){
         * System.out.println("StringIndexOutOfBoundsExciption 예외 발생!!!");
         * se.printStackTrace(); }
         */
        System.out.println("======  end  ======");

    }

}
