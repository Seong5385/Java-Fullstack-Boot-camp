package dbutil;

import java.sql.*;
// import java.util.*;

import java.util.Date;

// import domain.PersonVO;

public class DBSelectTest3 {
    public static void main(String[] args) {
        Long id = 0L;
        String userId = "";
        String userPw = "";
        String userName = "";
        String userEmail = "";
        String phone1 = "";
        String phone2 = "";
        byte age = 0;
        String addr1 = "";
        String addr2 = "";
        Date regDate = null;
        Date modDate = null;
        // List<PersonVO> list = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "jdbcuser";
        String pw = "jdbcuser";

        try (Connection conn = DriverManager.getConnection(url, user, pw)) {
            String sql = "select * from persons where id >= ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 0);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                id = rs.getLong("id");
                userId = rs.getString("userId");
                userPw = rs.getString("userPw");
                userName = rs.getString("userName");
                userEmail = rs.getString("userEmail");
                phone1 = rs.getString("phone1");
                phone2 = rs.getString("phone2");
                age = rs.getByte("age");
                addr1 = rs.getString("addr1");
                addr2 = rs.getString("addr2");
                regDate = rs.getTimestamp("regDate");
                modDate = rs.getTimestamp("modDate");
            }
            String result = """
                    PersonVO {
                        id       = %d
                        userId   = %s
                        userPw   = %s
                        userName = %s
                        email    = %s
                        phone    = %s-%s
                        age      = %d
                        address  = %s %s
                        regDate  = %s
                        modDate  = %s
                    }
                    """.formatted(
                    id, userId, userPw, userName, userEmail,
                    phone1, phone2,
                    age, addr1, addr2,
                    regDate, modDate);

            System.out.println(result);

        } catch (SQLException e) {

        }
    }
}
