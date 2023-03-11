package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("보유하고 있는 책의 권수를 입력해주세요 : ");
		int book = sc.nextInt();

		if (book == 0) {
			System.out.println("보유하고 있는 책이 없습니다.");
		} else if (book == 1) { // book이 0이 아닌 것 중에서 1인 것
			System.out.println(book + "book");
		} else { // book이 0이 아닌 것 중에서 1이 아닌 것
			System.out.println(book + "books");
		}

		
		sc.close();
	}

}
