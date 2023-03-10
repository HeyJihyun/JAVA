package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int tmp;
		
		if(num1 > num2) {
			tmp = num1; 
			if(num2 > num3) { 
				num1 = num3; 
				num3 = tmp; 
			} else if(num1 > num3) { // num1 > num3 > num2 
				num1 = num2;
				num2 = num3;
				num3 = tmp;
			} else { // num3 > num1 > num2 
				num1 = num2;
				num2 = tmp;
			}		
		} else { // num2 > num1  
			tmp = num2; 
			if(num1 > num3) { // num2 > num1 > num3 
				num2 = num1;
				num1 = num3;
				num3 = tmp;
			} else if(num2 > num3) { // num2 > num3 > num1 
				num2 = num3;
				num3 = tmp;
			}
			// num3 > num2 > num1 - 변수 변화 없음
		}
		System.out.printf("%d %d %d", num1, num2, num3);
	}

}
