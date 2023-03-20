package kr.ac.kopo.day10;

public class StringMain03 {
	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'o';
		
		System.out.println("str : [" + str + "]");
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		System.out.println(ch + "위치 : " + str.lastIndexOf(ch));
		
		ch = 'p';
		System.out.println(ch + "위치 : " + str.indexOf(ch)); // 찾으려는 문자가 없을 경우 -1 반환
		
		String searchStr = "lo";
		System.out.println(searchStr + "위치 : " + str.indexOf(searchStr)); // 찾으려는 문자가 없을 경우 -1 반환

		ch = 'l';
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		System.out.println(ch + "위치 : " + str.indexOf(ch,3));
		System.out.println(ch + "위치 : " + str.lastIndexOf(ch));
		
	}

}
