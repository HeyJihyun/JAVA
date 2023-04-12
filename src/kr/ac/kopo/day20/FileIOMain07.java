package kr.ac.kopo.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

/*
	$ FileIOMain07 a.txt b.txt

 */

public class FileIOMain07 {
	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("==============================================");
			System.out.println("\t명령어가 잘못 되었습니다.");
			System.out.println("\tjava FileIOMain07 원본파일명 대상파일명");
			System.out.println("==============================================");
			System.exit(0);
		}
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists() || !sourceFile.isFile()) {
			System.out.println(args[0] + "파일은 존재하지 않습니다.");
			System.exit(0);
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(args[1]);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int c = bis.read();
				if( c == -1) break;
				bos.write(c);
			}
			
			bos.flush();
			
			System.out.println(sourceFile + "파일을 " + args[1] + "파일에 복사 완료했습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("[" + args[0] + "] 파일은 존재하지 않습니다.");
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		}
	
	
	
	}

}
