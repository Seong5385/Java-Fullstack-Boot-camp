package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    // 도구 : Connection 객체를 반환하는 도구 생성...
    // method 이름 : getConnection()

    // 멤버변수(DB 접속 정보)
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String dbuser = "jdbcuser";
    private static final String password = "jdbcuser";

    // 드라이버 로드 확인 : 드라이버가 반드시 있어야 동작...
    // static {} : 은 한번 실행하고 두번 실행 안함.
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 실패 : " + e.getMessage());
        }
    }

    // 메서드 생성
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, dbuser, password);
    }

}
