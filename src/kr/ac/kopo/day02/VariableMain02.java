package kr.ac.kopo.day02;

public class VariableMain02 {
    public static void main(String[] args) {

        // double 형변환
        double num = 12.34;
        num = (double) 34; // double형 변수로 형변환
        num = 34; // 묵시적 형변환 (double > int) 변환할 자료형이 더 클경우 가능

        System.out.println("num : " + num);

        // int 형변환
        int num2;
        num2 = (int) 45.9; // int 형 변수로 형변환, 강제적(명시적) 형변환

        System.out.println("num2 " + num2);

        // float 형변환
        float num3;
        num3 = (float) 10.4; // 기본 실수 = double이기 때문에 묵시적 형변환 불가
        num3 = 10.2f; // f : float, L : Long

        System.out.println("num3 : " + num3);

        System.out.println(12 + 12.34); // 정수 + 실수 일 경우 묵시적 형변환 발생

    }

}
