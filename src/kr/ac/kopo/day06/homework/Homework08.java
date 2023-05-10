package kr.ac.kopo.day06.homework;

public class Homework08 {
    public static void main(String[] args) {
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 1; j <= 9; j++) {
                for (k = i * 3 + 1; k <= (i + 1) * 3; k++) {
                    System.out.printf("%2d *%2d = %2d   ", k, j, k * j);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
