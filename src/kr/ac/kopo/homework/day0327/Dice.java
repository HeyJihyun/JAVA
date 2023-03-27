package kr.ac.kopo.homework.day0327;

public class Dice  implements Game {
	@Override
	public int startGame(int you) {
		
		int me =  (int)(Math.random()*6)+1;
		int result = -1;
		String msg = "You lose";
		if(me == you) {
			msg = "You win";
			result = 1;
		}
		System.out.println(me);
		System.out.println(msg);
		return result; // 이겼을 때 1반환 졌을때 -1
	}

}
