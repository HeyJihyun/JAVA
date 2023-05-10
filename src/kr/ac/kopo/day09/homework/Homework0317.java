package kr.ac.kopo.day09.homework;

import java.util.Random;
import java.util.Scanner;

//1. 컴퓨터가 생각하고 있는 1-100사이의 정수를 맞추는 프로그램을 작성하시오
public class Homework0317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // 1~100까지 랜덤값 받기
        int random = r.nextInt(100) + 1;
        System.out.println(random);

        // 최소값, 최대값
        int max = 100;
        int min = 1;

        for (int i = 5; i >= 0; i--) {
            System.out.print(min + "-" + max + " : ");
            int num = sc.nextInt();

            if (random == num) { // 정답을 맞췄을 때
                System.out.println("축하합니다. 정답입니다");
                break;
            } else if (random > num) { // 입력한 값보다 큰 수 일때
                System.out.println(num + "보다 큰 수 입니다.");
                min = num + 1;

            } else {// 입력한 값보다 작은 수 일때
                System.out.println(num + "보다 작은 수 입니다.");
                max = num - 1;
            }

            if (i == 0) {// 기회를 모두 소진 했을 때
                System.out.println("아쉽습니다. 기회를 소진하셨습니다.");
                break;
            }

            System.out.println("기회는 총 " + i + "번 남았습니다.");
        }

        System.out.println("정답은 [" + random + "] 입니다.");
    }

}
