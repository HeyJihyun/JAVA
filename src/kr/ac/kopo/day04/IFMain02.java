package kr.ac.kopo.day04;

import java.util.Scanner;

/*
	보유하고 있는 책 권수 입력 : 3
	3 books
	
	보유하고 있는 책 권수 입력 : 1
	1 book
	
	보유하고 있는 책 권수 입력 : 0
	보유하고 있는 책 없음
*/
public class IFMain02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("보유하고 있는 책의 권수를 입력해주세요 : ");
        int book = sc.nextInt();

        if (book == 0) {
            System.out.println("보유하고 있는 책이 없습니다.");
        } else {
            if (book == 1) { // book이 0이 아닌 것 중에서 1인 것
                System.out.println(book + "book");
            } else { // book이 0이 아닌 것 중에서 1이 아닌 것
                System.out.println(book + "books");
            }
        }

//		if(book == 0){
//			System.out.println("보유하고 있는 책이 없습니다.");	
//		} else if(book == 1){ 
//			System.out.println(book + "book");
//		} else {
//			System.out.println(book + "books");
//		}

        sc.close();
    }
}
