package kr.ac.kopo.day09.homework;

import java.util.Scanner;

public class HomeworkBonus0317 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 100;
		int min = 1;
		int right = 1;
		int num = 50;
		
		while (right != 0 && min > 0 && max <= 100) {
			num = (max - min) / 2;
			System.out.println("생각한 숫자가 " + num + "입니까 ?");
			System.out.println("0: yes, 1 : up, -1 : down");

			right = sc.nextInt();
			switch (right) {
			case 0:
				break;
			case 1:
				max = num;
				break;
			case -1:
				min = num;
				break;
			}
		}
		
		System.out.println("생각한 숫자는 " + num + "입니다.");

	}

}
