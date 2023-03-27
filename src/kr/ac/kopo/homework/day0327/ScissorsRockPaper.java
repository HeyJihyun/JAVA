package kr.ac.kopo.homework.day0327;

public class ScissorsRockPaper implements Game {
	final static int SCISSOR = 1; // 가위
	final static int ROCK = 2; // 바위
	final static int PAPER = 3; // 보

	@Override
	public int startGame(int you) {
		int me = (int) (Math.random() * 3) + 1;
		
		int result = 0;
		
		System.out.println(me);
		// 이겼을 때 1, 비겼을때 0, 졌을때 -1 반환
		if(me+1 == you || me-2 == you) {
			System.out.println("You Win");
			result = 1;
		} else if(me != you){
			System.out.println("you lose");
			result = -1;
		} else {
			System.out.println("비겼습니다");
		}
		
		return result;
	}

}
