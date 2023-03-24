package kr.ac.kopo.homework.day0324;

import java.util.Scanner;

public class PlayerNum {
	private static Scanner sc = new Scanner(System.in);
	private int[] pnums = new int[3]; // player number 세자리
	
	public PlayerNum() {
		this(sc.nextInt()); // 플레이어 넘버 입력
	}
	
	public PlayerNum(int num){ // 입력받은 넘버값 각 자리에 삽입
		pnums[0] = num / 100;
		pnums[1] = num % 100 / 10;
		pnums[2] = num % 10;
	}
	
	// getter
	public int[] getPnums() {
		return pnums;
	}	

}
