package dbutil;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateTest1 {
    public static void main(String[] args) {

        Statement stmt = null;

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "jdbcuser";
        String pw = "jdbcuser";

        try (Connection conn = DriverManager.getConnection(url, userName, pw)) {

            String sql = "update persons set " +
                    "phone1='02', " +
                    "phone2='588-9991', " +
                    "age=20, " +
                    "modDate='" + date.format(new Date()) + "' " +
                    "where id=1";

            stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);

            System.out.println("수정된 행 수: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
