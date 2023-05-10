package kr.ac.kopo.day04;
/*
  1 - 3 사이의 정수 입력 : 
  1 입력 => ONE
  2 입력 => TWO
  3 입력 => THREE
  그 외 입력 => ERROR
 
 */

import java.util.Scanner;

public class SwitchMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 - 3 사이의 정수 입력 : ");

        int no = sc.nextInt();

//		if(no==1) {
//			System.out.println("ONE");			
//		} else if(no==2){
//			System.out.println("TWO");			
//		} else if(no==3) {
//			System.out.println("THREE");			
//		} else {
//			System.out.println("ERROR");						
//		}

        switch (no) {
        case 1:
            System.out.println("ONE");
            break;
        case 2:
            System.out.println("TWO");
            break;
        case 3:
            System.out.println("THREE");
            break;
        default:
            System.out.println("ERROR");
        }
    }

}
