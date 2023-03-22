package kr.ac.kopo.day12.extent;

class One {
	One(){
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One{
	Two(){
		super();// 자동호출
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Three() 생성자 호출...");
	}

}

public class ExtendMain01 {
	public static void main(String[] args) {
		new One();
		new Two();
		new Three();
	}

}
