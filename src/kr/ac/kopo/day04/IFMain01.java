package kr.ac.kopo.day04;

import java.util.Scanner;

/*
  보유하고 있는 책 권수 입력 : 3
  3 books
  
  보유하고 있는 책 권수 입력 : 1
  1 book
 */
public class IFMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("보유하고 있는 책의 권수를 입력해주세요 : ");
        int book = sc.nextInt();

        if (book == 1) {
            System.out.println(book + "book");
        } else {
            System.out.println(book + "books");
        }

        /*
         * System.out.print(book + " book");
         * 
         * if(book > 1) { System.out.println("s"); }
         */

        System.out.println(book + (book == 1 ? "book" : "books"));
        sc.close();

    }

}
