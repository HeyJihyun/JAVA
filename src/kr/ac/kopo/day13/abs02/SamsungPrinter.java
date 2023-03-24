package kr.ac.kopo.day13.abs02;

public class SamsungPrinter extends Printer{
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력합니다...");
	}
	
	@Override
	public void print() {
		System.out.println("Override 삼성프린터에서 출력합니다...");
	}

}
