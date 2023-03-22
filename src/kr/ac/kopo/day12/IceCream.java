package kr.ac.kopo.day12;

public class IceCream {
	String name;
	int price;
	static int total;
	
	IceCream(){
		
	}
	
	IceCream(String name, int price){
		this.name = name;
		this.price = price;
		IceCream.total += price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void totalInfo() {
		System.out.println("총액 : " + IceCream.total + "원");
	}

}
