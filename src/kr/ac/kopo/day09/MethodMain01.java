package kr.ac.kopo.day09;

public class MethodMain01 {
	
	static void prnStar() {
		System.out.println("**********");
	}
	static void prnStar(int num, String s) {
		for(int i = 1; i <= num; i++) {
			System.out.print('*');
		}
		System.out.println();
		System.out.println(s);
	}
	
	static int prnStar(int num) {
		return num%10 + num/10;
	}
	public static void main(String[] args) {
		
		int cnt = 10;
		prnStar(cnt, "HELLO");
		System.out.println("HELLO");
		prnStar(3, "HI");
		System.out.println("HI");
		prnStar(9,"Good-bye");
		System.out.println("Good-bye");
		prnStar(5, " ");

		System.out.println(prnStar(58));
	}

}
