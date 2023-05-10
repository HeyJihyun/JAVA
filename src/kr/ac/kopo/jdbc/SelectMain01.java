package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "select to_char(hire_date) as date1 " + "from employees";
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                System.out.println(rs.getString("date1"));
                // System.out.printf("%4s(%s)\n",rs.getString("id"), rs.getString("name") );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCClose.close(pstmt, conn);
        }

    }

}
