package kr.ac.kopo.day01;

public class ConstantMain {
	public static void main(String[] args) {
		
		int firstNum = 10;
		final int FIRST_NUM = 10; // final : 상수변수 만들기
		int secondNum = 123;
	
		firstNum = 200;
		
		System.out.println(firstNum + secondNum);
		System.out.println(FIRST_NUM + secondNum);
	}

}
