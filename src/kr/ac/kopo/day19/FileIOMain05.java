package kr.ac.kopo.day19;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// iotest/FileIOMain02.java.txt == > iotest/FileIOMain02-1.java.txt 복사
public class FileIOMain05 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("iotest/FileIOMain02.java.txt");
			fw = new FileWriter("iotest/FileIOMain02-1.java.txt");
			
			while(true) {
				int c = fr.read();
				fw.write(c);
				if(c == -1) break;
			}
			fw.flush();
			System.out.println("파일저장완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr);
			FileClose.close(fw);
			
		}
		
		
	}

}
