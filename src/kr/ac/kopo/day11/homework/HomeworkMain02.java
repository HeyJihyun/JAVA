package kr.ac.kopo.day11.homework;

public class HomeworkMain02 {

    public static void main(String[] args) {

        ScannerUtil scan = new ScannerUtil();
        StringUtil util = new StringUtil();

        System.out.println(util.reverseString(scan.nextStr("문자열 입력 : ")));

        System.out.println(util.toUpperString(scan.nextStr("문자열을 입력 : ")));

    }

}
