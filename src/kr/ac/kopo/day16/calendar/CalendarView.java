package kr.ac.kopo.day16.calendar;

import java.util.Scanner;

public class CalendarView {

    private Scanner sc;
    private CalendarUtil util;

    public CalendarView() {
        sc = new Scanner(System.in);
        util = new CalendarUtil();
    }

    public int scanInt(String msg) {
        System.out.println(msg);
        int type = sc.nextInt();
        sc.nextLine();
        return type;
    }

    public void process() {

        while (true) {

            int type = scanInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료)");
            int year, month;
            switch (type) {
            case 1:
                year = scanInt("년도를 입력 : ");
                util.showByYear(year);
                break;
            case 2:
                year = scanInt("년도를 입력 : ");
                month = scanInt("월을 입력 : ");
                util.showByMonth(year, month);
                break;
            case 3:
                System.out.println("달력서비스를 종료합니다");
                System.exit(0); // 소프트웨어 종료 (0) 안에 숫자는 종료 오류메시지, 0일경우 정상적인 오류로 인해 종료
            }
        }
    }

}
