package kr.ac.kopo.day09.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework03 {

   public static void main(String[] args) {
      
      Random r = new Random();
      int random = r.nextInt(100)+1;
      
      
      System.out.print("1 - 100 : ");
      
      Scanner sc = new Scanner(System.in);
      int nums = sc.nextInt();
      
      int i = 5, min = 1, max = 100;
      while (nums != random && i != 0) {
         if(nums < random) {
            System.out.printf("%d보다 큰 수 입니다.\n기회는 총 %d번 남았습니다.", nums, i);
            i--;
            min = nums+1;
            
         } else {
            System.out.printf("%d보다 작은 수 입니다.\n기회는 총 %d번 남았습니다.", nums, i);
            i--;
            max = nums-1;
            
         }
         
         System.out.printf("%d - %d : ", min , max);
         nums = sc.nextInt();
      }
      if(i == 0) {
         System.out.println("아쉽습니다. 기회를 소진하셨습니다. 정답은 [" + random + "]입니다.");
      } else {   
      System.out.println("축하합니다. 정답입니다.");
      }
      
      
      
      
   }

}