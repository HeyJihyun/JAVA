package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class HomeworkMain07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		/*
		for(int i = 0; i< nums.length; ) {
			System.out.printf("num %d : ", i+1);
			nums[i] = sc.nextInt();
			if(nums[i] >= 0 && nums[i] <= 99) i++;
		}
		*/
		
		int i = 0;
		while(i < nums.length) {
			System.out.printf("num %d : ", i+1);
			nums[i] = sc.nextInt();
			if(nums[i] >= 0 && nums[i] <= 99) i++;
		}
		
		
		System.out.println("< PRINT > ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(i = nums.length-1; i >= 0; i--) {
			
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1 * 10 + n10 + " ");
		
		}
		System.out.println();
		
		
	}

}
