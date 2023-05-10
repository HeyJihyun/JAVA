package kr.ac.kopo.day09;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        // 임이의 정수를 추출
        Random r = new Random();

        int random = r.nextInt(100);
        System.out.println(random);
    }

}
