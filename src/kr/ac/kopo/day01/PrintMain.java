package kr.ac.kopo.day01;

/*
 	출력메소드 System.out.출력메소드()
 	print() - 개행문자 x
 	println() - 개행문자를 가지고 있음
 	printf() - 1.5 이후 사용
 */

public class PrintMain {
	public static void main(String[] args) {
		// 10 12.34 홍길동
		System.out.print(10 + " " + 12.34 + " 홍길동" + '\n');
		System.out.printf("%d %.2f %s \n",10,12.34,"홍길동");
		
		System.out.print('홍');
		//방법3
		System.out.print("A\n");
		// 방법2
		System.out.print('A');
		System.out.print('\n');
		
		// 방법1
		System.out.println('A');
		System.out.println(10);
		System.out.println(12.34);
		System.out.printf("%c", 65);
	}

}
