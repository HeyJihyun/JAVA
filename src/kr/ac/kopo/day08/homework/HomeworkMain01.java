package kr.ac.kopo.day08.homework;

public class HomeworkMain01 {
	public static void main(String[] args) {

		int snail = 0, hour = 0;
		while(snail < 100) {
			snail += (snail < 50 ? 5-1 : 5-2);
			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n ", ++hour, snail);
		}
		/*
		while ((snail += 5) < 100) {
			snail += (snail < 50 ? -1 : -2);
			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n ", ++hour, snail);
		}
		System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n ", ++hour, snail);
		 */
		
		/*
		while (snail < 100) {
			snail += 5;
			snail += (snail < 50 ? -1 : -2);
			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n ", ++hour, snail);
		}
		*/

	}

}
