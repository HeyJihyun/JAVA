package kr.ac.kopo.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  Set : 순서 X 중복 X
  구현클래스 
  	-HashSet
  	-TreeSet
  메소드 
  	add() : 데이터 삽입
  	contains() : 데이터 존재여부 판단
  	remove() : 특정 데이터 삭제
  	clear() : 전체 데이터 삭제
  	size() : 크기
  	isEmpty() : 특정 데이터 유무 판단
 */
public class SetMain {
    public static void main(String[] args) {

//		Set<String> set = new TreeSet<>(); // TreeSet은 사전순으로 정렬
        Set<String> set = new HashSet<>();

        set.add("one");
        System.out.println("add(two) : " + set.add("two"));
        set.add("three");
        set.add("four");
        set.add("five");
        System.out.println("add(two) : " + set.add("two")); // 중복은 허용하지 않음, add실패 시 false값 리턴
        System.out.println("set : " + set);

        System.out.println("remove(two) : " + set.remove("two"));
        System.out.println("remove(two) : " + set.remove("two"));

        // "two" 가 존재하면 삭제하고 "삭제성공", 존재하지 않으면 존재하지 않음 출력
        System.out.println(set.remove("two") ? "삭제성공" : "존재하지 않음");

        /*
         * Set의 전체데이터 접근 방식 1. 1.5버전의 for문 이용 2. toArray() 메소드 이용 3. Iterator 객체 이용
         */
        System.out.println("< 1.5버전의 for문 >");
        for (String data : set) {
            System.out.println(data);
        }

        System.out.println("< toArray() 메소드 이용 >");
        Object[] dataArr = set.toArray();
        for (int i = 0; i < dataArr.length; i++) {
            System.out.println(dataArr[i] + ", length() : " + ((String) dataArr[i]).length());
        }
        /*
         * Iterator(순환자 객체) hasNaect() : 다음데이터 존재여부 판단 next() : 데이터를 이용
         */
        System.out.println("< Iterator 객체 이용 >");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
