package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class HomeworkMain04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작단 입력 : ");
		int sDan = sc.nextInt();

		System.out.print("종료단 입력 : ");
		int eDan = sc.nextInt();
		
		int start = sDan, end = eDan;
		if(start > end) {
			start = eDan;
			end = sDan;
		}

		for (int dan = start; dan <= end; dan++) {
			System.out.println("*** " + dan + "단 ***");
		}

	}

}
