package kr.ac.kopo.day03;

public class OperationMain02 {
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
//		boolean result = ++a > 1 && ++b >=0; // 앞 항이 거짓이기 때문에 뒷항 ++b는 실행하지 않음
//		boolean result = ++b >= 0 && ++a > 1; 
		boolean result = ++b >= 0 || ++a > 1; 
		
		System.out.println(result);
		System.out.printf("a = %d b = %d \n", a, b);
	}

}
