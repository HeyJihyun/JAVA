package kr.ac.kopo.day09.homework;

import java.util.Scanner;

public class Homework01 {
   
   public static void main(String[] args) {
      
      int[][] primeArr = new int[10][20];
      int arr = 0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("정수를 입력하세요. 최대 10개 입력, 0 입력시 종료됩니다");
      
      
      do {
         primeArr[arr][0] = sc.nextInt();
         int j = 1;
         for(int i = 1; i <= primeArr[arr][0]; i++) {
            if(primeArr[arr][0] % i == 0) {
               primeArr[arr][j++] = i;
            }
         }
         primeArr[arr][0] = j-1;
         
      } while (primeArr[arr][0] != 0 && ++arr <  primeArr.length);
      
      for(int[] a : primeArr) {
         int inx = a[0];
         System.out.print(a[a[0]] + "의 약수 : ");
         for(int data = 1; data <= inx ; data++) {
            System.out.print(a[data] + " ");
         }
         System.out.println();
      }
      
      
      
      
      
      
      
      
      
   
   }

}


