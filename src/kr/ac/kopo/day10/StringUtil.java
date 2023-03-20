package kr.ac.kopo.day10;

public class StringUtil {
	
	/**
	 * 문자의 대문자 여부 확인
	 * @param c 확인 할 문자
	 * @return 대문자 : true, 소문자 : false
	 */
	boolean isUpperChar(char c) {
		if(c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 문자의 소문자 여부 확인
	 * @param c 확인 할 문자
	 * @return 소문자 : true, 대문자 : false
	 */
	boolean isLowerChar(char c) {
		if(c >= 'a' && c <= 'z') {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * 두 정수 중 큰 값 비교
	 * @return 둘 중 큰값 반환
	 */
	int max( int i, int j) {
		return i > j ? i : j;
	}
	
	/**
	 * 두 정수 중 작은 값 비교
	 * @return 둘 중 작은 값 반환
	 */
	int min(int i, int j) {
		return i < j ? i : j;
	}
	
	
	/**
	 * 문자열을 거꾸로 변경하는 메소드
	 * @param str 뒤집을 문자열
	 * @return 뒤집은 문자열 반환
	 */
	String reverseString(String str) {
		
		/** 뒤집은 문자열을 받아 둘 문자형 배열*/
		char[] rvs = new char[str.length()];
		
		// 문자열을 반대순서대로 rvs 배열에 하나씩 삽입
		for(int i = str.length()-1; i >= 0 ; i--) {
			str.getChars(i, i+1, rvs, str.length()-i -1);
		}
		
		// 문자형 배열 rvs 를 String 형으로 변환
		String rvsStr = new String(rvs);
		
		return rvsStr;
	}
	
	/**
	 * 입력받은 문자열을 모두 대문자로 반환
	 * @param str 대문자로 변환할 문자열
	 * @return 대문자로 변환 된 문자열
	 */
	String toUpperString(String str) {
		String upStr = "";
		
		// 소문자 일 때 -32로 대문자 변환
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a') {
				upStr += (char)(str.charAt(i) - 32);
			} else {
				upStr += str.charAt(i);
			}
		}
		
		return upStr;
	}
	
	/**
	 * 입력받은 문자열을 모두 소문자로 반환
	 * @param str 소문자로 변환할 문자열
	 * @return 소문자로 변환 된 문자열
	 */
	String toLowerString(String str) {
		String loStr = "";
		
		// 대문자 일때 +32 로 소문자 변환
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= 'Z') {
				loStr += (char)(str.charAt(i) + 32);
			} else {
				loStr += str.charAt(i);
			}
		}
		
		return loStr;
	}
	
	/**
	 * 두 문자열 크기 비교
	 * @param str
	 * @param str2
	 * @return
	 */
	int compareTo(String str, String str2) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		
		return 0;
	}
	
	/**
	 * 
	 * @param str
	 * @param sub
	 * @return
	 */
	boolean endsWith(String str, String sub) {
		
		for(int i = str.length()-sub.length();  i < str.length(); i++) {
			if(str.charAt(i) != sub.charAt(i-( str.length()-sub.length()))) 
				return false;
		}
		return true;
	}
	
	
	// 교수님 사랑해요..모르겠어요....
	int indexOf(String str, String sub) {
		
		int index = -1;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == sub.charAt(0)) {
				for(int j = 1; j < sub.length(); j++) {
					if(str.charAt(i+j) == sub.charAt(0)) {
						return i;
					}
				}
			}
		}
		
		return index;
	}

}

