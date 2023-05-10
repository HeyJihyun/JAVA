package kr.ac.kopo.day08.homework;

public class HomeworkMain05 {

    public static void main(String[] args) {

        int step = 2;

        for (int i = 2; i <= 9; i += step) {
            for (int j = 0; j <= 9; j++) {
                for (int k = i; k <= 9 && k < i + step; k++) {
                    if (j == 0) {
                        System.out.print("*** " + k + "단 *** \t");
                    } else {
                        System.out.printf("%d * %d = %d\t", k, j, k * j);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        /*
         * for(int i = 2; i <= 9; i += 3) { for(int j = 1; j <= 9; j++) {
         * System.out.printf("%d * %d = %d\t", i, j , i*j);
         * System.out.printf("%d * %d = %d\t", i + 1, j , i*j); if(i+2 <= 9) {
         * System.out.printf("%d * %d = %d\t", i + 2, j , i*j); } System.out.println();
         * } System.out.println(); }
         */

    }

}
