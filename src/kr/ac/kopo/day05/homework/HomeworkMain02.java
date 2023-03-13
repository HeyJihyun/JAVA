package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개를 입력 : ");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		// 방법 2
		int max = num > num2 ? num : num2;
		if(num3 > max) {
			max = num3;
		}
		if(num4 > max) {
			max = num4;
		}
		
		System.out.println("가장 큰수 : " + max);
		
		
		/*
		// 방법 1
		int max01 = num > num2 ? num : num2;
		int max02 = num3;
		if(num3 < num4) {
			num2 = num4;
		}
		
		System.out.println("가장 큰수 : " + (max01 > max02 ? max01 : max02));
		*/
		
		
		
	}

}
