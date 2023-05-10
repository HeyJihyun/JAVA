package kr.ac.kopo.day06.exam;

public class ForPractice {
    public static void main(String[] args) {
        System.out.println("문제14");
        int star = 1;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= star; j++) {
                System.out.print('*');
            }
            System.out.println();
            star += 2;
        }

        System.out.println("문제15");
        star = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= star; j++) {
                System.out.print('*');
            }
            System.out.println();
            star -= 2;
        }

        System.out.println("문제15");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 11 - 2 * i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("문제16");
        star = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= (9 - star) / 2; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= star; j++) {
                System.out.print('*');
            }
            System.out.println();
            if (i < 5) {
                star -= 2;
            } else {
                star += 2;
            }
        }

        System.out.println("문제16");
        int k = 5;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= k + 4; j++) {
                if (j <= 5 - k) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            if (i < 5) {
                k--;
            } else {
                k++;
            }
            System.out.println();
        }

        System.out.println("문제17");
        star = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= (5 - star) * 2 - 1; j++) {
                System.out.print('-');
            }
            for (int j = 1; j <= star; j++) {
                System.out.print('*');
            }
            System.out.println();
            if (i < 5) {
                star++;
            } else {
                star--;
            }
        }

        System.out.println("문제17");
        star = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= star || 9 - j < star) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
            if (i < 5) {
                star++;
            } else {
                star--;
            }
        }

    }

}
