package kr.ac.kopo.day05.practice;

public class ForPractice01 {
	public static void main(String[] args) {

		System.out.println("1번 문제");
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 5; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("2번 문제");
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 5; ++j) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("3번 문제");
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 5; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("4번 문제");
		for (int i = 1; i <= 5; ++i) {
			for (int j = i; j <= i + 4; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("4번 문제2");
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 5; ++j) {
				System.out.print(i + j - 1);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("5번 문제");
		for (int i = 5; i >= 1; --i) {
			for (int j = i; j <= i + 4; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("5번 변형");
		for (int i = 9; i >= 5; --i) {
			for (int j = i; j >= i - 4; --j) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("6번 문제");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("7번 문제");
		for (int i = 5; i >= 1; --i) {
			for (int j = i; j >= 1; --j) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("8번 문제");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
				}
			for(int k = 5-i; k >= 0; --k) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("9번 문제");
		for(int i = 5; i >= 1; --i) {
			for(int j = i-1; j >= 1; --j) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 6-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =5; i >= 1; --i) {
			for(int j = 1; j <= 5; ++j) {
				if(i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
	}

}
