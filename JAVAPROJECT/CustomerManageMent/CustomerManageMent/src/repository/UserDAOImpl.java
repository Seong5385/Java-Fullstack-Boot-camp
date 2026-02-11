package repository;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import dbutil.DBUtil;
import dto.UserDTO;

public class UserDAOImpl implements Users {
    private List<UserDTO> list = new ArrayList<>();

    @Override
    public int userAdd(UserDTO dto) {

        int result = 0;
        try {

            String sql = """
                    INSERT INTO persons
                    (userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                    """;
            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getUserPw());
            pstmt.setString(3, dto.getUserName());
            pstmt.setString(4, dto.getUserEmail());
            pstmt.setString(5, dto.getPhone1());
            pstmt.setString(6, dto.getPhone2());
            pstmt.setInt(7, dto.getAge());
            pstmt.setString(8, dto.getAddr1());
            pstmt.setString(9, dto.getAddr2());

            result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "레코드 추가 성공" : "레코드 추가 실패");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public int userMod(UserDTO user, String oldUserId) {
        int result = 0;
        try {

            String sql = """
                    UPDATE persons
                    SET
                        userId    = ?,
                        userPw    = ?,
                        userName  = ?,
                        userEmail = ?,
                        phone1    = ?,
                        phone2    = ?,
                        age       = ?,
                        addr1     = ?,
                        addr2     = ?,
                        modDate   = ?
                    WHERE userId = ?;
                                        """;
            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getUserPw());
            pstmt.setString(3, user.getUserName());
            pstmt.setString(4, user.getUserEmail());
            pstmt.setString(5, user.getPhone1());
            pstmt.setString(6, user.getPhone2());
            pstmt.setInt(7, user.getAge());
            pstmt.setString(8, user.getAddr1());
            pstmt.setString(9, user.getAddr2());
            pstmt.setTimestamp(10,
                    new Timestamp(System.currentTimeMillis()));
            pstmt.setString(11, oldUserId);

            result = pstmt.executeUpdate();
            System.out.println("업데이트 완료");

        } catch (SQLException e) {
            System.out.println("DB 동작 에러!!");
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public int userDel() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        System.out.print("삭제할 아이디를 입력하세요: ");
        String id = br.readLine();
        int result = 0;

        try {
            String sql = """
                    DELETE FROM persons
                    WHERE userId = ?
                    """;
            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, id);

            result = pstmt.executeUpdate();
            System.out.println("삭제 완료");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public List<UserDTO> userAll() {
        ResultSet rs;

        try {

            String sql = """
                    SELECT * FROM persons
                     """;
            Statement stmt = DBUtil.getMysqlConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                new UserDTO();
                list.add(UserDTO.builder()
                        .id(rs.getLong("id"))
                        .userId(rs.getString("userId"))
                        .userName(rs.getString("userName"))
                        .userEmail(rs.getString("userEmail"))
                        .age(rs.getByte("age"))
                        .phone1(rs.getString("phone1"))
                        .phone2(rs.getString("phone2"))
                        .addr1(rs.getString("addr1"))
                        .addr2(rs.getString("addr2"))
                        .build());
            }

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return list;
    }

    @Override
    public List<UserDTO> userSearchIdName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));

        System.out.print("아이디를 입력하세요: ");
        String userId = br.readLine();

        System.out.print("비밀번호를 입력하세요: ");
        String pw = br.readLine();

        List<UserDTO> result = new ArrayList<>();

        ResultSet rs;
        try {
            String sql = """
                    SELECT * FROM persons
                    WHERE userId = ? and userPw = ?
                     """;
            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                new UserDTO();
                result.add(UserDTO.builder()
                        .id(rs.getLong("id"))
                        .userId(rs.getString("userId"))
                        .userName(rs.getString("userName"))
                        .userEmail(rs.getString("userEmail"))
                        .age(rs.getByte("age"))
                        .phone1(rs.getString("phone1"))
                        .phone2(rs.getString("phone2"))
                        .addr1(rs.getString("addr1"))
                        .addr2(rs.getString("addr2"))
                        .build());
            }

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public List<UserDTO> userSearchEmail(String email) {
        List<UserDTO> result = new ArrayList<>();

        ResultSet rs;
        try {
            String sql = """
                    SELECT * FROM persons
                    WHERE userEmail = ?
                     """;

            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, email);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                new UserDTO();
                result.add(UserDTO.builder()
                        .id(rs.getLong("id"))
                        .userId(rs.getString("userId"))
                        .userName(rs.getString("userName"))
                        .userEmail(rs.getString("userEmail"))
                        .age(rs.getByte("age"))
                        .phone1(rs.getString("phone1"))
                        .phone2(rs.getString("phone2"))
                        .addr1(rs.getString("addr1"))
                        .addr2(rs.getString("addr2"))
                        .build());
            }

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public boolean login(String id, String pw) {
        String sql = """
                SELECT userPw
                FROM persons
                WHERE userId = ?
                """;

        try (PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql)) {

            pstmt.setString(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {

                // 아이디 존재
                if (rs.next()) {
                    String dbPw = rs.getString("userPw");

                    // 비밀번호 일치하면 true
                    if (dbPw.equals(pw)) {
                        return true;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        // 아이디 없거나 비밀번호 틀리거나 에러
        return false;
    }

}
