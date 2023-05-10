package kr.ac.kopo.day07.homework;

import java.util.Scanner;

/*
	7번 문제		9번 문제			11번 문제			문제13		문제15
	*****		    *			*****			    *		*********
	****		   **			****			   **		 *******
	***			  ***			***				  ***		  *****
	**			 ****			**				 ****		   ***
	*			*****			*				*****		    *
								**				 ****
								***				  ***
								****			   **
								*****			    *
	
	문제17
	*       *
	**     **
	***   ***
	**** ****
	*********
	**** ****
	***   ***
	**     **
	*       *
	
	
								
 */
public class StarHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("*을 찍을 숫자 입력 : ");
        int num = sc.nextInt();

        System.out.println("문제7");
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("문제9");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j > num - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("문제11");
        int k = num;
        for (int i = 1; i < 2 * num; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print('*');
            }
            if (i >= num) {
                k++;
            } else {
                k--;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("문제13");
        k = 1;
        for (int i = 1; i < 2 * num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j <= num - k) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            if (i >= num) {
                k--;
            } else {
                k++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("문제15");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num - i; j++) {
                if (j <= i - 1) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("문제17");
        k = 1;
        if (num % 2 == 0)
            num--;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j <= k || num - j < k) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            if (i > num / 2) {
                k--;
            } else {
                k++;
            }
            System.out.println();
        }

    }

}
