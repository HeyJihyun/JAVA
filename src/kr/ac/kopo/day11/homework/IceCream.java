package kr.ac.kopo.day11.homework;

public class IceCream {
	
	int orderNo;
	String name;
	int price;
	static int total;
	
	IceCream(){
		
	}
	
	IceCream(int orderNo, String name, int price){
		this.orderNo = orderNo;
		this.name = name;
		this.price = price;
		total += price;
	}
	
	// 아이스크림 정보 출력 메소드
	void info() {
		System.out.println(orderNo + "\t" + name + "\t\t" + price);
	}

}


