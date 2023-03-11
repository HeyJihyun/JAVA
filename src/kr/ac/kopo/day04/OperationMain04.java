package kr.ac.kopo.day04;

/*
 	두개 정수 입력 : 12 5
 	12는 5의 배수 판단 : 배수가 아닙니다
 	두개 정수 입력 : 12 6
 	12는 6의 배수판단 : 배수입니다.
 */
public class OperationMain04 {
	public static void main(String[] args) {
		
		int num01 = 12, num02 = 4; // , 순서 연산자
		boolean bool = num02 != 0 && num01 % num02 == 0;
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d은 %d의 %s\n", num01, num02, result );
		
		
	}

}
