package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.List;

/*
 	기본자료형			참조자료형
 	boolean			Boolean
 	char			Character
 	byte			Byte
 	short			Short
 	int 			Integer
 	long			Long
 	float			Float
 	double			Double
 	
 
 */

public class WrapperMain {
	public static void main(String[] args) {
		int i = 12;
		System.out.println("i : " + i);
		
		int i2 = new Integer("12");
		System.out.println("i2 : " + i2);
		
		int i3 = i2; // auto unboxing
		System.out.println("i3 : " + i3);
		
		Integer i4 = i; // auto boxing
		System.out.println("i4 : " + i3);
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(100));
		list.add(20);
	
	}

}
