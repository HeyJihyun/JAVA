package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class UpdateMain02 {
    public static void main(String[] args) {

        String sql = "update t_test " + "   set name = ? " + " where id   = ?";

        try (Scanner sc = new Scanner(System.in);
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            System.out.println("아이디를 입력");
            String id = sc.nextLine();
            System.out.println("변경할 이름을 입력");
            String name = sc.nextLine();

            pstmt.setString(1, name);
            pstmt.setString(2, id);

            int cnt = pstmt.executeUpdate();

            if (cnt != 0)
                System.out.println("이름변경이 완료되었습니다.");
            else
                System.out.println("해당 아이디가 존재하지 않습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
