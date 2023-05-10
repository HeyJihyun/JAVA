package kr.ac.kopo.day08.homework;

import java.util.Scanner;

/*   
 	0이 나올때까지 정수를 입력받아 입력받은 정수의 약수들을 출력하는 코드를 작성하시오
   단, 10개의 정수가 나오면 프로그램을 종료합니다
*/
public class Homework031601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] primeArr = new int[10][20];

        System.out.println("정수를 입력하세요. 0 입력시 종료");
        for (int i = 0; i < primeArr.length; i++) {
            int num = sc.nextInt();
            if (num <= 0)
                break;
            for (int j = num, k = 0; j >= 1; j--) {
                if (num % j == 0) {
                    primeArr[i][k] = j;
                    k++;
                }
            }
        }

        for (int[] i : primeArr) {
            if (i[0] != 0) {
                System.out.print(i[0] + "의 약수 : ");
            }
            for (int j = i.length - 1; j >= 0; j--) {
                if (i[j] != 0)
                    System.out.print(i[j] + " ");
            }

            System.out.println();
        }
    }

}
