package kr.ac.kopo.day16;

import kr.ac.kopo.day15.inter.LGTV;

class A{
	private Object member;
	
	A(Object member){
		this.member = member;
	}
	
	Object getMember() {
		return member;
	}
}

class B<T>{
	private T member;
	
	B(T member){
		this.member = member;
	}
	
	T getMember() {
		return member;
	}
}

public class GenericMain {
	public static void main(String[] args) {
		
		B<String> b1 = new B<String>("hello");
		B<LGTV> b2 = new B<LGTV>(new LGTV());
//		new B<String>(new LGTV()); - 설정한 타입이 달라서 오류가 남
		b1.getMember();
		b2.getMember();
		
		/*
		A a1 = new A("hello");
		String str = (String)a1.getMember();
		System.out.println(str);
		
		A a2 = new A(new LGTV());
		LGTV tv = (LGTV)a2.getMember();
		tv.powerOn();
		*/
	}

}
