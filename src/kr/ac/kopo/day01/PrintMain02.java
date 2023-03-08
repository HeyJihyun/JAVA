package kr.ac.kopo.day01;
/*
 	printf : 변환 문자를 이용하여 상수 출력
 		%c : 문자
 		%d : 10진수 정수
 		%f : 실수
 		%s : 문자열
 		%b : 논리값
 */
public class PrintMain02 {
	public static void main(String[] args) {
		System.out.println(5 == 3);
		System.out.println(false);
		System.out.printf("%d %.2f %s \n", 10, 31.141592, "홍길동");
		System.out.printf("%d %.4f %s \n", 10, 31.141592, "홍길동");
		System.out.printf("[%5d] [%7.4f] [%10s] \n", 10, 31.141592, "홍길동");
		System.out.printf("[%-5d] [%-7.4f] [%-10s] \n", 10, 31.141592, "홍길동");
		System.out.printf("[%05d] [%-7.4f] [%10s] \n", 12345678, 31.141592, "홍길동");
		
		System.out.printf("%.1f\n", 14.52 - 0.05);
		System.out.printf("%.1f\n", 14.58 - 0.05);
		
		System.out.printf("4 > 2 : %b\n", 4 > 2);
	}

}
