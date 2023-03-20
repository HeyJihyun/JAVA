package kr.ac.kopo.day09;

public class ArrayMain07 {
	
	public static void main(String[] args) {
		
		char[][] arr = {
				{'a', 'b', 'c' ,'d'},
				{'e', 'f', 'g'}, 
				{'h','i','j','k'}
		};
		
		System.out.println("행의 개수 : " + arr.length);
		System.out.println("첫번째 행의 열 개수 : " + arr[0].length);
		System.out.println("두번째 행의 열 개수 : " + arr[1].length);
		System.out.println("세번째 행의 열 개수 : " + arr[2].length);
		/*
		 * for(int i = 0; i < arr.length; i++) { for(int j = 0; j< arr[i].length; j++) {
		 * System.out.print(arr[i][j] + " "); } System.out.println(); }
		 */
		for(char[] a : arr) {
			System.out.println(a);
			for(char b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
