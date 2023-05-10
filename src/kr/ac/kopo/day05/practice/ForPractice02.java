package kr.ac.kopo.day05.practice;

public class ForPractice02 {
    public static void main(String[] args) {
        // for3, if1
        System.out.println();
        System.out.println("10번 문제");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 4; j >= i - 5; --j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // for2, if1
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            int a = i; // <= 5 ? i : 10 -i;
            if (i > 5) {
                a = 10 - i;
            }
            for (int j = 1; j <= a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // for3, if1
        System.out.println();
        System.out.println("11번 문제");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 5; j >= i; --j) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i - 4; ++j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // for2, if1
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            int a = i >= 5 ? i - 4 : 6 - i;

            for (int j = 1; j <= a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // 문12 for3 if3
        System.out.println();
        System.out.println("문제12 for3 if3");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= 5; j++) {
                    if (i <= j) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    if (9 - i < j) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }

        // 문12 for5 if1
        System.out.println();
        System.out.println("문제12 for5 if1");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 6 - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 9 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i - 4; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 문12 for3 if1
        System.out.println();
        System.out.println("문제12 for3 if1");
        for (int i = 1; i <= 9; i++) {
            int a = i;
            if (i > 5) {
                a = 10 - i;
            }
            for (int j = 1; a > j; j++) {
                System.out.print(' ');
            }
            for (int j = 5; a <= j; j--) {
                System.out.print('*');
            }
            System.out.println();
        }

        // 문12 for2 if2
        System.out.println();
        System.out.println("문제12 for2 if2");
        for (int i = 1; i <= 9; i++) {
            int a = i <= 5 ? i : 10 - i;
            for (int j = 1; j <= 5; j++) {
                char ch = a - j >= 1 ? ' ' : '*';
                System.out.print(ch);
            }
            System.out.println();
        }

        // 문 13 for5 if1
        System.out.println();
        System.out.println("문제13 for5 if1");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
            } else {
                for (int j = 1; j <= i - 5; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= 10 - i; j++) {
                    System.out.print('*');
                }

            }
            System.out.println();
        }

        // 문 13 for3 if3
        System.out.println();
        System.out.println("문제13 for3 if3");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= 5; j++) {
                    if (5 - i >= j) {
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    if (i >= j + 5) {
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }

                }
            }
            System.out.println();
        }

        // 문 13 for3 if1
        System.out.println();
        System.out.println("문제 13 for3 if1");
        for (int i = 1; i <= 9; i++) {
            int a = i;
            if (i > 5) {
                a = 10 - i;
            }
            for (int j = 5; j > a; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // 문 13 for2 if2
        System.out.println();
        System.out.println("문제 13 for2 if2");
        for (int i = 1; i <= 9; i++) {
            int a = i; // 1 2 3 4 5 6 7 8 9
            if (i > 5)
                a = 10 - i; // 1 2 3 4 5 4 3 2 1
            for (int j = 1; j <= 5; j++) {
                if (5 - a >= j) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

}
