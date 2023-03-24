package kr.ac.kopo.day13;

public class CastMain01 {
	
	public static void print(Parent p) {
		p.info();
	}
	
	public static void print(Object o) { // 어떤 객체를 메개변수로 받던 묵시적 형변환 가능
	} 
	
	public static void main(String[] args) {
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		/*
		Child01 c01 = new Child01();
		c01.info();
		
		Child02 c02 = new Child02();
		c02.info();
		
		Parent p = new Parent();
		p.info();
		*/
		
		
		
		/*
		Child01 c01 = new Child01();
		c01.info();
		c01.sleep();
		c01.study();
		
		Parent p = new Child01();
		p.info();
//		p.sleep(); 접근 불가
//		p.study(); 접근 불가
		
		*/
		
		
		
		
	}

}
