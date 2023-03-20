package kr.ac.kopo.day10.exam;

public class MethodExamMain {
	public static void main(String[] args) {
		MethodExam exam = new MethodExam();
		
		int total = exam.getTotal(10, 100);
		
		System.out.println("10~100 사이의 총합 : " + total);
		
		exam.printGugudan(5);
		exam.printGugudan();
		
		System.out.println("시작단 : ");
		int startDan = exam.getDan();
		System.out.println("종료단 : ");
		int endDan = exam.getDan();
		
		exam.printGugudan(startDan, endDan);
	}

}
