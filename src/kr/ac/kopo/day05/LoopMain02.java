package kr.ac.kopo.day05;

public class LoopMain02 {
	public static void main(String[] args) {
		
		for(int cnt = 1; cnt <=5; ++cnt) { // for(;;) - 무한루프			
			System.out.println("Hello");
		} //cnt 변수 사라짐
	
//		System.out.println(cnt); Error

		for(int cnt = 1; cnt <=3; ++cnt) { // 이전에 선언했던 cnt를 새로 선언해서 사용가능			
			System.out.println("God-bye");
		}
	}

}
