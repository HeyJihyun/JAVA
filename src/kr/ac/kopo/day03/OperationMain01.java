package kr.ac.kopo.day03;

public class OperationMain01 {
	public static void main(String[] args) {

		int num = 123;
		
//		num = num + 1;
		
		num += 50; // 복합대입 연산자, 배정 연산자 : += -= *= /= %=
		
		num += 1;
		
		++num; // 증감연산자 
		
 		System.out.println("num : " + num);
		
 		int a = 5;
 		System.out.println(a++);
 		System.out.println(++a);
 		System.out.println(--a);
 		System.out.println(a);
 		System.out.println(a--);
 		System.out.println(a++);
 		System.out.println(a);
 		
 		
	}

}
