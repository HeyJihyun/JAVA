package kr.ac.kopo.homework.day0331;

import java.io.File;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        // 경로저장 변수 지정
        String path = "iotest";

        while (true) {

            // path경로의 File 초기화 및 해당경로 출력 메소드
            File f = FileUtil.dirView(path);
            System.out.println("-----------------");

            System.out.print("[c] 새폴더  [m] 하위디렉토리이동  [U] 상위디렉토리이동  [R]이름변경 ==>");
            char c = sc.nextLine().charAt(0);
            switch (c) {
            case 'c':
                // 새폴더 생성
                FileUtil.newDir(path);
                break;
            case 'm':
                // 하위디텍토리 이동
                path = FileUtil.childDir(f);
                break;
            case 'u':
                // 상위디렉토리 이동
                path = FileUtil.parentDir(f);
                break;
            case 'r':
                // 이름변경
                if (!FileUtil.rename(f))
                    System.out.println("해당파일이 없습니다.");
                break;
            default:
                // 이외에 선택시 프로그램 종료
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
                System.exit(0);
            }

        }
    }

}
