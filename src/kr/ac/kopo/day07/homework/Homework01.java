package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번재 정수 입력 : ");
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		// 전체 입력한 정수 출력
		for(int i = 0; i< num.length; i++) {
			System.out.println("num" + (i+1) + " : "+ num[i]);
		}
		System.out.println();
		
		// 짝수 출력
		System.out.println(" < 짝수 > ");
		for(int i : num) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}

		// 홀수 출력
		System.out.println("\n < 홀수 > ");
		for(int i : num) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
