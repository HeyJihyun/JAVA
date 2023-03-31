package kr.ac.kopo.homework.day0331.copy;

import java.io.File;
import java.util.Scanner;

public class HomeworkMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "iotest";
		
		while(true) {
			File f = FileUtil.dirView(path);
			System.out.println("-----------------");
			
			System.out.print("[c] 새폴더  [m] 하위디렉토리이동  [U] 상위디렉토리이동  [R]이름변경 ==>");
			
			char c = sc.nextLine().charAt(0);
			switch(c) {
			case 'c' : 
				FileUtil.newDir(path);
				break;
			case 'm' : 
				path = FileUtil.childDir(f);
				break;
			case 'u' :
				path = FileUtil.parentDir(f);
				break;
			case 'r' :
				if(!FileUtil.rename(f)) System.out.println("실패했습니다.");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				System.exit(0);
			}
			
		}
		
		
		
	}

}
