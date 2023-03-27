package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain02 {
	public static void main(String[] args) {
		
		System.out.println("====== start ======");
		
		Random r = new Random();
		int random = r.nextInt(3);

		System.out.println("random : " + random);
	
		try {
			System.out.println("\t " + 10 / random);
		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		
		System.out.println("======  end  ======");
		
	}

}
