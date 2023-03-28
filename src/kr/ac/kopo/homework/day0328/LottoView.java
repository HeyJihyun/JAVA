package kr.ac.kopo.homework.day0328;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoView {
	private static Random r = new Random();
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임수를 입력 : ");
		int gameCnt = sc.nextInt();
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto5()));
		}
	}

	// 방법1 Set 이용
	private int[] getLotto1() {
		int[] lottoNums = new int[6];
		
		Set<Integer> set = new HashSet<>();
		for(int i = 1; i <= 6; i++) {
			while(!set.add(r.nextInt(45)+1)) {}; // set.add가 false가 나오면 다시 삽입
		}
		
		// Set형을 int[]로 변환
		Object[] setArr = set.toArray();
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (Integer)setArr[i];
		}
		
		return lottoNums;
	}
	
	// 방법2 list 이용
	private int[] getLotto2() {
		int[] lottoNums = new int[6];
		
		List<Integer> list = new ArrayList<>();
		
		while(list.size() < 6) { 
			int rnum = r.nextInt(45)+1;
			if(!list.contains(rnum)) { // 랜덤으로 받은 숫자가 list에 없으면 list에 삽입
				list.add(rnum);
			}
		}
		// list형을 int[]로 변환
		Object[] listArr = list.toArray();
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (Integer)listArr[i];
		}
		
		return lottoNums;
	}
	
	// int[] 이용
	private int[] getLotto3() {
		int[] lottoNums = new int[6];
		
		for(int i = 0; i < lottoNums.length; i++) {
			int rnum = r.nextInt(45)+1;
			lottoNums[i] = rnum;
			for(int j = 0; j < i; j++) {
				if(lottoNums[j] == rnum) {
					i--;
				}
			}
		}
		return lottoNums;
	}

	//6개 int 배열에 1~45랜덤한 숫자 6개 넣는 메소드
	private int[] randomLotto() {
		int[] lottoNums = new int[6];
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt();
		}
		return lottoNums;
	}
	
	
	// 배열에 중복값있으면 false 없으면 true
	boolean bool(int[] r) {
		for(int i = 0; i < r.length; i++) {
			for(int j = 0; j < i; j++) {
				if(r[i] == r[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	private int[] getLotto4() {
		// 1~45까지 랜덤한 숫자 6개받기
		int[] lottoNums = randomLotto();
		while(!bool(lottoNums)) { // 배열에 중복값이 있으면
			randomLotto(); //랜덤숫자 6개 다시받기
		}
		return lottoNums;
	}


	
	private int[] getLotto5() {
		int[] lottoNums = new int[6];
		
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45)+1;
			for(int j = i-1; j >= 0; ) {
				if(lottoNums[i] == lottoNums[j]) {
					lottoNums[i] = r.nextInt(45)+1;
				} else {
					j--;
				}
			}
		}
		
		return lottoNums;
	}

	

}
