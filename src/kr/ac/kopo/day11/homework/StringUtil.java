package kr.ac.kopo.day11.homework;

public class StringUtil {
	
	boolean isUpperChar(char c) {
		if('A' <= c && c <= 'Z') {
			return true;
		}
		return false;
	}
	
	boolean isLowerChar(char c) {
		if('a' <= c && c <= 'z') {
			return true;
		}
		return false;
	}
	
	int max(int i, int j) {
		return i > j ? i: j;
	}
	
	String reverseString(String str) {
		char[] chars = new char[str.length()];
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		return new String(chars);
		
		/*
		String revStr = "";
		for(int i = str.length()-1; i >= 0; i-- ) {
			revStr += str.charAt(i); 
		}
		return revStr;
		 */
	}
	
	String toUpperString(String str) {
		String upStr = "";
		
		// 소문자 일 때 -32로 대문자 변환
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) {
				c = (char)(c + ('A' - 'a'));
			} 
			
			upStr = upStr + c;
		}
		
		return upStr;
	}
	
	int compareTo(String str, String str2) {
		int leng = str.length() < str2.length()? str.length() : str2.length();
		
		for(int i = 0; i < leng; i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		
		if(str.length() == str2.length()) {
			return 0;
		} else if(str.length() == leng) {
			return -str2.charAt(leng);
		}
		return str.charAt(leng);
	 
	}
	
	
	

}
