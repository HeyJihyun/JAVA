package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("보유하고 있는 책의 권수 : ");
		int book = sc.nextInt();

		if (book < 0) {
			System.out.println("잘 못 입력했습니다");
		} else if (book == 0) {
			System.out.println("보유하고 있는 책 없다");
		} else if (book == 1) {
			System.out.println(book + "book");
		} else {
			System.out.println(book + "books");
		}
		
		
		switch(book) {
		case 0:
			System.out.println("보유하고 있는 책 없다");
			break;
		case 1:
			System.out.println(book + "book");
			break;
		default : 
			String msg = book > 0 ? book + "books" : "잘 못 입력했습니다";
			System.out.println(msg);
		}

	}

}
