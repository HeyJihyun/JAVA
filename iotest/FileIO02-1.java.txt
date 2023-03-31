package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.ac.kopo.util.FileClose;

public class FileIOMain02 {

	// iotest/Koala.jpg 파일을 iotest/Koala2.jpg에 복사
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = fis.read();
				fos.write(c);
				if(c == -1) break;
			}
			fos.flush(); // 버퍼에 남아있는 데이터 모두 전달
			long end = System.currentTimeMillis();
			System.out.println("Koala2.jpg에 복사완료...");
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fis);
			FileClose.close(fos);
			
			/*
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/
		}
		
		
	}

}
