package domain.ex;

import java.util.stream.IntStream;
import java.sql.*;

public class DbInsertTest1 {
    public static void main(String[] args) {

        IntStream.range(0, 10).forEach(i -> {
            PersonRe vo = PersonRe.builder()
                    .userId("user" + (5 + i))
                    .userPw("userPw" + i)
                    .userName("user" + (i + 5))
                    .userEmail("user" + (5 + i) + "@naver.com")
                    .age(30 + i)
                    .phone1("02")
                    .phone2("99" + (i % 9) + "-123" + (i % 10))
                    .addr1("서울 마포구 성산동")
                    .addr2("23번지 " + (1 + i))
                    .build();

            insertDB(vo);
        });
    }

    public static void insertDB(PersonRe vo) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "jdbcuser";
        String password = "jdbcuser";

        String sql = """
                INSERT INTO persons
                (userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, vo.userId());
            pstmt.setString(2, vo.userPw());
            pstmt.setString(3, vo.userName());
            pstmt.setString(4, vo.userEmail());
            pstmt.setString(5, vo.phone1());
            pstmt.setString(6, vo.phone2());
            pstmt.setInt(7, vo.age());
            pstmt.setString(8, vo.addr1());
            pstmt.setString(9, vo.addr2());

            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "레코드 추가 성공" : "레코드 추가 실패");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }
    }
}
