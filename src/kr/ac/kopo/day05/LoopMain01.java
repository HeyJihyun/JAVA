package kr.ac.kopo.day05;

public class LoopMain01 {
    public static void main(String[] args) {

        int cnt = 1;
        while (cnt <= 5) {
            System.out.println("Hello");
            ++cnt;
        }
        System.out.println("cnt : " + cnt);

        /* int */cnt = 1; // 이미 있는 변수명이기 때문에 재선언 불가
        while (cnt <= 3) {
            System.out.println("Good-bye");
            ++cnt;
        }

    }

}
