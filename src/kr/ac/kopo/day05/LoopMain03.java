package kr.ac.kopo.day05;

public class LoopMain03 {
    public static void main(String[] args) {

        int cnt = 1;
        while (cnt >= 5) { // false 0회 실행
            System.out.println("Hello");
            ++cnt;
        }

        for (; cnt >= 5; cnt--) { // false 0회 실행
            System.out.println("Hello");
        }

        do { // 최소 한번은 찍기 위해 반복문을 위로 올려서 사용 - 스텝수가 한번 적음
            System.out.println("Hello");
            ++cnt;
        } while (cnt <= 5); // 위에있는 {}과 관련있는 걸 표현하기 위해 마지막에 ; 을 붙임

    }

}
