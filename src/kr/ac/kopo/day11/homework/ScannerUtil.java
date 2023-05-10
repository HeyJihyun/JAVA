package kr.ac.kopo.day11.homework;

import java.util.Scanner;

/**
 * 다양한 상수를 입력 받을 수 있는 기능 클래스
 * 
 * @author User
 *
 */
public class ScannerUtil {

    Scanner sc;

    public ScannerUtil() {
        sc = new Scanner(System.in);
    }

    public char nextChar(String msg) {
        System.out.print(msg);
        return sc.nextLine().charAt(0);
    }

    public int nextInt(String msg) {
        System.out.print(msg);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    public String nextStr(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

}
