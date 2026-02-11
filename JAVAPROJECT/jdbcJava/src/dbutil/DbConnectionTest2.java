package dbutil;

import java.sql.*;

public class DbConnectionTest2 {
    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "jdbcuser";
        String pw = "jdbcuser";

        try (Connection conn = DriverManager.getConnection(url, userName, pw)) {

            String sql = "select * from persons";
            stmt = conn.createStatement(); // ⭐ 핵심
            rs = stmt.executeQuery(sql);

            boolean hasResult = false;

            while (rs.next()) { // ⭐ 다건 처리
                hasResult = true;
                System.out.println("id        : " + rs.getLong("id"));
                System.out.println("userId    : " + rs.getString("userId"));
                System.out.println("userPw    : " + rs.getString("userPw"));
                System.out.println("userName  : " + rs.getString("userName"));
                System.out.println("userEmail : " + rs.getString("userEmail"));
                System.out.println("phone1    : " + rs.getString("phone1"));
                System.out.println("phone2    : " + rs.getString("phone2"));
                System.out.println("age       : " + rs.getInt("age"));
                System.out.println("addr1     : " + rs.getString("addr1"));
                System.out.println("addr2     : " + rs.getString("addr2"));
                System.out.println("regDate   : " + rs.getTimestamp("regDate"));
                System.out.println("modDate   : " + rs.getTimestamp("modDate"));
                System.out.println("-----------------------------");
            }

            if (!hasResult) {
                System.out.println("결과 없음");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
