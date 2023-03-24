package kr.ac.kopo.day13.homework;

public class Square  extends Rectangle{
	
	Square(){
		this(sc.nextInt("한변의 길이를 입력하세요 : "));
	}
	
	Square(int width){
		super(width,width); // rectangle 클래스 생성자
		setName("정사각형");
	}

}
