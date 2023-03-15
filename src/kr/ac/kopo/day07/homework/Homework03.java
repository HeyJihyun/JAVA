package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "\'s 성적 : ");
			score[i] = sc.nextInt();
		}
		
		System.out.println(" < PRINT > ");
		System.out.println("번호\t 성적\t 학점\t");
		int total = 0;
		int cntError = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] <= 100) {
				char grade = score[i] >= 90 ? 'A' : 
					score[i] >= 80 ? 'B' : 
					score[i] >= 70 ? 'C' : 
					score[i] >= 60 ? 'D' : 'F';
				System.out.printf("%d\t %d\t %c\n", i+1, score[i], grade);
				total += score[i];
			} else {
				System.out.printf("%d\t %s", i+1, "ERROR!!\n");
				cntError++;
			}
		}
		System.out.println();
		System.out.println(score.length + "명의 입력중 [" + cntError + "]회 에러발생");
		System.out.printf("총점 : %5d점\n", total);
		System.out.printf("평균 : %.2f점" , (double)total/score.length);
		
		sc.close();
	}

}
