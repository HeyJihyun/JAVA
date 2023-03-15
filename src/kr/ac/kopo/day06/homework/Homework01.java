package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		System.out.println("문제1. 1~100까지 출력");
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");
		
		System.out.println("문제2. 1~99까지 홀수만 출력");
		for(int i = 1; i <= 99; i+=2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");
		
		System.out.println("문제3. 100~2까지 짝수만 출력");
		for(int i = 100; i>=2; i-=2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n");
		
		
		System.out.println("문제4.");
		int goal = 0;
		int time = 0;
		while(goal < 100) {
			goal += 5;
			if(goal < 50) {
				goal--;
			} else {
				goal -= 2;
			}
			System.out.printf("[%02d시간 후] 달팽이가 올라간 총 높이 : %dM\n", ++time , goal);
		}
		System.out.println("\n");
		
		System.out.println("문제5. 2-9사이의 단을 입력받아 구구단을 출력하는 코드를 작성하시오");
		
		Scanner sc = new Scanner(System.in);
		
		int dan = 1;
		
		do {
			System.out.println("2-9사이의 단을 입력해주세요.\n");		
			System.out.print("2 - 9 사이의 단을 입력 : ");
			dan = sc.nextInt();
		} while (dan < 2 || dan > 9 ); 
		
		
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		System.out.println("\n");

		
		System.out.println();
		System.out.println("문제6. 전체 구구단을 출력하시오.");
		for(int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		
		System.out.println("문제7. 시작단과 종료단을 입력받아 구구단을 출력하느 코드를 작성하시오");
		
		System.out.print("시작단을 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("종료단을 입력 : ");
		int num2 = sc.nextInt();
		
		int start = num1 < num2 ? num1 : num2;
		int	end = num1 < num2 ? num2 : num1;
		for(int i = start; i <= end; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("문제8. 구구단을 한라인에 3단씩 출력하시오.(반복문 최대 3개만 이용)"); 

		for(int k = 2; k <= 9 ; k+=3) {
//			if(k == 8) {
//				System.out.printf("   *** %d단, %d단***   \n", k, k+1);
//			} else {
//				System.out.printf("   *** %d단, %d단, %d단***   \n", k, k+1, k+2);				
//			}
			for (int i = 1; i <= 9; i++) {
				for (int j = k; j <= k + 2; j++) {
					if(j == 10) {
						break;
					}
					System.out.printf("%d * %d = %d \t", j, i, i * j);
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println();
		
		
	}

}
