package kr.ac.kopo.day15;

public class ExceptionMain05 {
	public static void main(String[] args) {

		System.out.println("====== start ======");
		try { 
//			String str = null;
			String str = "hello";
			System.out.println("length : " + str.length());
			
			return; // return을 만나도 finally는 반드시 실행
		} catch(Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally { // 자원관리를 위해 사용
			System.out.println("무조건 실행됩니다.");
		}
		System.out.println("======  end  ======");

	}

}
