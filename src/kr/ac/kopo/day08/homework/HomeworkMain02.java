package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class HomeworkMain02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2 - 9사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <=9; i++) {
			
			System.out.println(dan + " * " + i + "=" + (dan*i));
		}
		
	}

}
