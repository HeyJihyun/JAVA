package kr.ac.kopo.day10;

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean bool;
		System.out.print("문자 입력 : ");
		bool = su.isUpperChar(sc.nextLine().charAt(0));
		System.out.println(bool);
		
		System.out.print("문자 입력 : ");
		bool = su.isLowerChar(sc.nextLine().charAt(0));
		System.out.println(bool);
		
		int num;
		System.out.print("정수 두개 입력 : ");
		num = su.max(sc.nextInt(), sc.nextInt());
		System.out.println(num);

		System.out.print("정수 두개 입력 : ");
		num = su.min(sc.nextInt(), sc.nextInt());
		System.out.println(num);
		
		System.out.print("문자열 입력 : ");
		sc.nextLine();
		String str = su.reverseString(sc.nextLine());
		System.out.println(str);
		
		System.out.print("문자열 입력 : ");
		str = su.toUpperString(sc.nextLine());
		System.out.println(str);
		str = su.toLowerString(str);
		System.out.println(str);
		
		String str2 = "hello";
		
		System.out.println(su.compareTo(str, str2));
		*/
		
		String str = "hello wor";
		String sub = "hello";
		System.out.println(su.compareTo(str, sub));
		
		ScannerUtil scan = new ScannerUtil();
		
		str = "hello world Java";
		sub = "o";
		System.out.println(StringUtil.checkChar(str, 'l'));
		
		System.out.println(StringUtil.removeChar(str, 'o'));
		
		System.out.println(su.indexOf(str, sub));
		
		System.out.println(su.endsWith("hello", "o") );
		
	}
	

}
