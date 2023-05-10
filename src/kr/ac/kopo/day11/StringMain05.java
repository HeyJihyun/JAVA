package kr.ac.kopo.day11;

import java.util.Arrays;

public class StringMain05 {
    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println("str : [" + str + "]");
        String sub = str.substring(3, 8);

        System.out.println("sub : [" + sub + "]");

        int idx = str.indexOf("World");
        idx = str.indexOf("World");
        sub = str.substring(idx);
        System.out.println("sub : [" + sub + "]");

        str = "Hello World!!!";
        idx = str.indexOf("World");
        sub = str.substring(idx, idx + "World".length());
        System.out.println("sub : [" + sub + "]");

        String a = "Hello";
        String b = "good-bye";
//		String c = a + b;
        String c = a.concat(b);
        System.out.println("c : " + c);

        String str2 = str.replace("l", "rr");
        System.out.println("str : [" + str + "]");
        System.out.println("str : [" + str2 + "]");

        str = "        Hello	 world		";
        System.out.println("[" + str + "]의 길이 : " + str.length());
        str = str.trim();
        System.out.println("[" + str + "]의 길이 : " + str.length());

        str = "Hello World!!!";
        System.out.println("toUpperCase() : " + str.toUpperCase());
        System.out.println("toLowerCase() : " + str.toLowerCase());

        str = "경기도 성남시 수정로 398";
        String[] address = str.split(" ");
        System.out.println(Arrays.toString(address));

        String ip = "172.31.9.164";
        String[] ipArr = ip.split("\\."); // .은 앞에 \\를 두개 붙여야함
        System.out.println(Arrays.toString(ipArr));

        int no = 123;
        double no2 = 10.23;
        System.out.println(no + 100);
        System.out.println(no2 + 100);

        System.out.println(String.valueOf(no) + 100);
        System.out.println(String.valueOf(no2) + 100);
    }

}
