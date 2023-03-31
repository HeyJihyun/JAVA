package kr.ac.kopo.homework.day0331.copy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileUtil {
	private static Scanner sc = new Scanner(System.in);
	private static String path = "iotest";
	private static File file = new File(path); 
	
	public static void dirView() {
		System.out.println("-----------------");
		System.out.println(file.getPath());
		System.out.println("-----------------");
		String[] dataArr = file.list();
		
		if(dataArr != null) {
			for (String data : dataArr){
				File file = new File(path + "/" + data);
				
				if(file.isDirectory()) {
					System.out.printf("%-20s \t <DIR>\n", data);
				} else {
					long lastTime = file.lastModified();
					
					String pattern = "yyyy-MM-dd HH:mm:ss";
					SimpleDateFormat sdf = new SimpleDateFormat(pattern);
					
					System.out.printf("%-20s \t\t %15s\t%s\n", data, file.length() + "bytes", sdf.format(new Date(lastTime)));				
				}
			}
		}
		
	}
	
	public static void newDir() {
		System.out.print("새로만들 폴더명을 입력해주세요 : ");
		path = path + "/" + sc.nextLine();
		file = new File(path);
		file.mkdirs();
	}
	
	public static String childDir() {
		System.out.print("이동할 하위 폴더를 입력해주세요 : ");
		String[] dataArr = file.list();
		String path = sc.nextLine();
		for(String data : dataArr) {
			if(path.equals(data)) {
				return dirObj.getName() + "/" + path;
			}
		}
		
		System.out.println("해당 폴더가 없습니다.");
		return dirObj.getName();
		
	}
	
	public static String parentDir(File f) {
		return f.getParent() == null ? f.getName() : f.getParent();
	}
	
	public static boolean rename(File f) {
		
		System.out.println("변경할 파일을 선택해주세요.");
		File oldFile = new File(f.getName() + "/" + sc.nextLine());
		System.out.println("새로운 이름을 입력하세요.");
		File newFile = new File(f.getName() + "/" + sc.nextLine());
		
		
		
		return oldFile.renameTo(newFile);
	}

}
