package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int tmp = num1;	

		if(num1 > num2 && num1 > num3) { // num1이 가장 클 때
			
			if(num2 > num3) { // num3 < num2 < num1
				num1 = num3; 
			} else { // num2 < num3 < num1
				num1 = num2;
				num2 = num3;
			}	
			num3 = tmp; 
			
		} else if(num2 > num3){ // num2가 가장 클때
			tmp = num2; 

			if(num1 > num3) { // num3 < num1 < num2
				num2 = num1;
				num1 = num3;
			} else { // num1 < num3 < num2 
				num2 = num3;
			}
			num3 = tmp; 
			
		} else if(num1 > num2) { //num2 < num1 < num3
			num1 = num2;
			num2 = tmp; 
		} // 모두 아닐 때 그냥 출력 num1 < num2 < num3
		
		System.out.printf("%d %d %d", num1, num2, num3);
	}

}
