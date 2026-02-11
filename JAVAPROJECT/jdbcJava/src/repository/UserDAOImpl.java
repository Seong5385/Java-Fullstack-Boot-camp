package repository;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import dbutil.DBUtil;
import domain.Entity.UsersVO;

public class UserDAOImpl implements Users {
    private List<UsersVO> list = new ArrayList<>();

    @Override
    public int userAdd(UsersVO vo) {

        int result = 0;
        try {

            String sql = """
                    INSERT INTO persons
                    (userId, userPw, userName, userEmail, phone1, phone2, age, addr1, addr2)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                    """;
            PreparedStatement pstmt = DBUtil.getConnection().prepareStatement(sql);
            pstmt.setString(1, vo.getUserId());
            pstmt.setString(2, vo.getUserPw());
            pstmt.setString(3, vo.getUserName());
            pstmt.setString(4, vo.getUserEmail());
            pstmt.setString(5, vo.getPhone1());
            pstmt.setString(6, vo.getPhone2());
            pstmt.setByte(7, vo.getAge());
            pstmt.setString(8, vo.getAddr1());
            pstmt.setString(9, vo.getAddr2());

            result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "레코드 추가 성공" : "레코드 추가 실패");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public int userMod(UsersVO before, UsersVO after) {
        int result = 0;
        try {

            String sql = "update person set userId=?, userPw=?, userName=?" +
                    "userEmail=?, phone1=?, phone2=?, age=?, address1=?, address2=?" +
                    ", modifyDate=? where id = ?";

            PreparedStatement pstmt = DBUtil.getConnection().prepareStatement(sql);
            pstmt.setString(1, after.getUserId());
            pstmt.setString(2, after.getUserPw());
            pstmt.setString(3, after.getUserName());
            pstmt.setString(4, after.getUserEmail());
            pstmt.setString(5, after.getPhone1());
            pstmt.setString(6, after.getPhone2());
            pstmt.setByte(7, after.getAge());
            pstmt.setString(8, after.getAddr1());
            pstmt.setString(9, after.getAddr2());
            pstmt.setTimestamp(10,
                    new Timestamp(System.currentTimeMillis()));
            pstmt.setLong(11, before.getId());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("DB 동작 에러!!");
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public int userDel(UsersVO user) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("삭제할 아이디를 입력하세요: ");
        int i = Integer.parseInt(br.readLine());
        int result = 0;

        try {
            String sql = """
                    DELETE FROM jdbc
                    WHERE id = ?
                    """;
            PreparedStatement pstmt = DBUtil.getConnection().prepareStatement(sql);
            pstmt.setInt(1, i);

            result = pstmt.executeUpdate();
            System.out.println("삭제 완료");

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public List<UsersVO> userAll() {
        ResultSet rs;

        try {

            String sql = """
                    SELECT * FROM persons
                     """;
            Statement stmt = DBUtil.getConnection().createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                new UsersVO();
                list.add(UsersVO.builder()
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
    public List<UsersVO> userSearchIdName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("출력 할 아이디를 입력하세요: ");
        int i = Integer.parseInt(br.readLine());

        System.out.print("이름을 입력하세요: ");
        String name = br.readLine();

        List<UsersVO> result = new ArrayList<>();

        ResultSet rs;
        try {
            String sql = """
                    SELECT * FROM persons
                    WHERE id = ? and userName = ?
                     """;
            PreparedStatement pstmt = DBUtil.getConnection().prepareStatement(sql);
            pstmt.setInt(1, i);
            pstmt.setString(2, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                new UsersVO();
                result.add(UsersVO.builder()
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
    public List<UsersVO> userSearchEmail(String email) {

        String sql = """
                SELECT * FROM persons
                WHERE userEmail = ?
                 """;

        List<UsersVO> result = new ArrayList<>();

        ResultSet rs;
        try {
            PreparedStatement pstmt = DBUtil.getConnection().prepareStatement(sql);
            pstmt.setString(1, email);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                new UsersVO();
                result.add(UsersVO.builder()
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

}
