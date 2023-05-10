package kr.ac.kopo.day02;

public class VariableMain01 {
    public static void main(String[] srgs) {

        char ch;
        ch = 'A';

        {
            int a = 10;
            System.out.println("a : " + a);
        }
        // a = 20; // 문법오류가 발생됨

        ch = '!';
        ch = 80;
        ch = '\u0061'; // 유니코드로 삽입, 16진수 네자리로 적어야함.

        System.out.println("ch : " + ch);
    }

}
