package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBMain {

    public static void main(String[] args) {

        try {
            // 1.드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 완료...");

            // 2. DB접송
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            System.out.println("DB연결 완료...");

            // 3. SQL 쿼리 실행

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
