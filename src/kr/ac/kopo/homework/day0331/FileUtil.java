package kr.ac.kopo.homework.day0331;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileUtil {
	private static Scanner sc = new Scanner(System.in);
	
	// path경로의 File 반환 및 해당 경로 출력 메소드
	public static File dirView(String path) {
		File dirObj = new File(path);
		System.out.println("-----------------");
		System.out.println(dirObj.getPath()); // 해당 경로 출력
		System.out.println("-----------------");
		String[] dataArr = dirObj.list();// 해당 경로의 목록
		
		if(dataArr != null) {
			for (String data : dataArr){ 
				File file = new File(path + "/" + data); // 해당경로에 있는 파일을 담는 file 변수 생성
				if(file.isDirectory()) { // file이 폴더라면
					System.out.printf("%-20s \t <DIR>\n", data);
				} else { // 폴더가 아니라면
					long lastTime = file.lastModified();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					System.out.printf("%-20s \t\t %15s\t%s\n", data, file.length() + "bytes", sdf.format(new Date(lastTime)));				
				}
			}
		}
		
		return dirObj; //File 반환
	}
	
	// 새폴더생성
	public static void newDir(String path) {
		System.out.print("새로만들 폴더명을 입력해주세요 : ");
		path = path + "/" + sc.nextLine();
		File file = new File(path);
		file.mkdirs(); // 입력된 폴더명의 새폴더 생성
	}
	
	// 하위디렉토리이동
	public static String childDir(File f) {
		System.out.print("이동할 하위 폴더를 입력해주세요 : ");
		String[] dataArr = f.list(); // 경로 내 파일 목록 
		String path = sc.nextLine();
		for(String data : dataArr) { 
			if(path.equals(data)) { // 입력된 파일이 해당 경로 목록에 있으면
				return f.getName() + "/" + path; // 현재경로/하위폴더명  String 반환
			}
		}
		// File f에 해당 파일이없으면
		System.out.println("해당 폴더가 없습니다."); 
		return f.getName();
		
	}
	
	// 상위디렉토리이동
	public static String parentDir(File f) {
		// 상위디렉토리가 없으면 현재경로, 있으면 상위경로 반환
		return f.getParent() == null ? f.getName() : f.getParent();
	}
	
	// 이름변경
	public static boolean rename(File f) {
		
		System.out.println("변경할 파일을 선택해주세요.");
		// 원본 파일을 File형으로 초기화
		File oldFile = new File(f.getName() + "/" + sc.nextLine());
		
		// 수정할 파일명 File형으로 초기화
		System.out.println("새로운 이름을 입력하세요.");
		File newFile = new File(f.getName() + "/" + sc.nextLine());
		
		// 이름변경 후 성공하면 ture, 실패하면 false
		return oldFile.renameTo(newFile);
	}

}
