package kr.ac.kopo.day05;

public class BreakMain01 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				break; // 반복문의 조건식이 true라도 반복문을 빠져나가게 함.
			}
			System.out.println("HI");
		}
		
		System.out.println(cnt);
	}

}
