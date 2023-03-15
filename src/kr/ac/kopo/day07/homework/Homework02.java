package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int[] reverse = new int[num.length];
		
		// 0~99 정수 입력
		for(int i = 0; i < num.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			num[i] = sc.nextInt();
			if(num[i] < 0 || num[i] > 99) {
				i--;
			}
			reverse[i] = num[i]%10*10 + num[i]/10;
		}
		
		// print 출력
		System.out.println(" < PRINT >");
		for(int i :num) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// reverse 출력
		System.out.println(" < REVERSE >");
		for(int i = reverse.length-1; i >= 0 ; i--) {
			System.out.print(reverse[i] + " ");
		}
		System.out.println();		
		
		sc.close();
	}

}
