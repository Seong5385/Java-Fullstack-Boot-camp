package dbutil;

import java.sql.*;

public class DBUtil {

    private static final String oracleUrl = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
    private static final String mySqlUrl = "jdbc:mysql://localhost:3306/jdbc";
    private static final String mariaDbUrl = "jdbc:mariadb://localhost:4306/jdbc";
    private static final String dbuser = "jdbcuser";
    private static final String password = "jdbcuser";

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 실패 : " + e.getMessage());
        }
    }

    public static Connection getOracleConnection() throws SQLException {
        return DriverManager.getConnection(oracleUrl, dbuser, password);
    }

    public static Connection getMysqlConnection() throws SQLException {
        return DriverManager.getConnection(mySqlUrl, dbuser, password);
    }

    public static Connection getMariaDbConnection() throws SQLException {
        return DriverManager.getConnection(mariaDbUrl, dbuser, password);
    }
}
