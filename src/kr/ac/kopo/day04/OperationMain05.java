package kr.ac.kopo.day04;

public class OperationMain05 {
    public static void main(String[] srgs) {

        int num = 0x0055ff00;
        System.out.printf("%08X\n", num); // 16진수 표현

        System.out.printf("%08X\n", ~num); // 16진수 뒤집기
        System.out.printf("%08X\n", num & 0xffff0000); // 16진수 & 하위 4개 0으로 초기화
        System.out.printf("%08X\n", num | 0x0000ffff); // 16진수 & 하위 4개 f로 초기화
    }

}
