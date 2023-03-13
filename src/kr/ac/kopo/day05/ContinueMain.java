package kr.ac.kopo.day05;
                      
public class ContinueMain {
	public static void main(String[] args) {
		int cnt = 1;
		
		for(cnt = 1; cnt <= 10; cnt++) {
			if(cnt >= 3) {
				continue; // if else 문으로 대체가 가능하기 때문에 잘 사용하지 않음.
			}
			System.out.println("HI");
		}
		
		System.out.println(cnt);
	}
 
}
  