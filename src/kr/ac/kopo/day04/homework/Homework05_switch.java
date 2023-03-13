package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework05_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("보유하고 있는 책의 권수 : ");
		String book = sc.nextLine();
		String msg = book;

		/*
			지현씨 12권이면요???
		*/		

		switch(book.charAt(0)) {
		case '-':
			msg = "잘 못 입력했습니다";
			break;
		case '0':
			msg ="보유하고 있는 책 없다";
			break;
		case '1':
			switch(book) {
			case "1" :
				msg = book + " book";
				break;
			}
		default : 
			msg = book + " books" ;
		}
		System.out.println(msg);

	}

}
