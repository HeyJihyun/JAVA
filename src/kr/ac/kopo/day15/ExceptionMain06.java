package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {
	
	public static void a() {
		
		
		System.out.println("a() 시작");
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("a() 종료");
		// 컴파일시점 예외처리, checked Exception
		
	}
	
	public static void b() throws Exception{
		System.out.println("b() 시작....");
		String str = null;
		System.out.println("length : " + str.length());
		System.out.println("b() 종료....");
	}
	
	public static void main(String[] args) throws Exception{ // 메인메소드에서 jvm에 예외처리 토스 잘안씀, 하지만 가능은함
//		try {
			b();			
//		} catch(Exception ne) {
//			System.out.println("메인 예외처리....");
//			ne.printStackTrace();
//		}
		a();
	}

}
