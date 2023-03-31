package kr.ac.kopo.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// iotest/FileIOMain02.java.txt == > iotest/FileIOMain02-1.java.txt 복사
public class FileIOMain06 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("iotest/FileIOMain02.java.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("iotest/FileIOMain02-1.java.txt");
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			fw.flush();
			System.out.println("파일복사완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
			
		}
		
		
	}

}
