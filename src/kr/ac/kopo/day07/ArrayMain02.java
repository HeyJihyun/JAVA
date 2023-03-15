package kr.ac.kopo.day07;

public class ArrayMain02 {
	public static void main(String[] args) {
		
//		int[] arr = {10, 20, 30, 40, 50};
		int[] arr = new int[] {10, 20, 30, 40, 50};
				
		/*
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			 arr[i] = (i+1) * 10;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}		
		 */
		
		arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		
		
		
	}

}
