package kr.ac.kopo.day16.calendar;

import java.util.Calendar;

public class CalendarUtil {
    public Calendar c;

    // 기본 생성자, 인스턴스 객체 생성시 canlendar 객체 생성
    public CalendarUtil() {
        c = Calendar.getInstance();
    }

    // year년의 1~12월 출력 메소드
    public void showByYear(int year) {
        for (int month = 1; month <= 12; month++) {
            showByMonth(year, month);
        }
    }

    // year년 month월 출력 메소드
    public void showByMonth(int year, int month) {

        System.out.printf("  *** %4d년 %02d월 *** \n", year, month);
        // year년 month월 1일로 날자 정보 수정
        c.set(year, month - 1, 1);

        // 요일 추출
        int week = c.get(Calendar.DAY_OF_WEEK);

        // 해당월의 마지막날
        int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        showByDay(week, lastday);
//		System.out.println("week : " + week + "lastday : " + lastday);
    }

    // 1~말일까지 달력 출력 - 내부클래스(CalendarUtill)에서만 사용(은닉성)
    // private으로 메소드 생성시 doc으로 내보내도 나타나지않음
    private void showByDay(int week, int lastday) {
        System.out.println("=============================");
        System.out.printf(" %c%4c%4c%4c%4c%4c%4c\n", '일', '월', '화', '수', '목', '금', '토');
        System.out.println("=============================");
        int cnt = 0;
        for (int i = 1; i < week; i++) {
            System.out.printf("%4c", ' ');
            cnt++;
        }
        for (int day = 1; day <= lastday; day++) {
            System.out.printf(" %02d ", day);
            if (++cnt % 7 == 0 && day < lastday) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("=============================");
    }
}
