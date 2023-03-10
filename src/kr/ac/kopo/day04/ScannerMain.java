package kr.ac.kopo.day04;

import java.util.Scanner; //(1.5버전 이후 사용가능)

public class ScannerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력 : ");
		
		char ch = sc.nextLine().charAt(1);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
//		String str = sc.next(); // sc.next() - 한 단어 별로 인식
		String str = sc.nextLine(); // sc.nextLine() - 한 문장 단위 인식
		
		System.out.println("str : "+  str);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
	
		System.out.print("실수를 입력 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("num2 = " + num2);
		
		sc.close();
		
	}

}
