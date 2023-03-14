package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework03_rivice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a < b && a < c ? a : b < c ? b : c;
		int mid = (a < b && a > c)  || (a > b && a < c) ? a : 
			a < b && b < c || a > b && b > c ? b : c; 
		int max = a > b && a > c ? a : b > c ? b : c;
		
		System.out.println(min + " " + mid + " "+ max);
	}

}
