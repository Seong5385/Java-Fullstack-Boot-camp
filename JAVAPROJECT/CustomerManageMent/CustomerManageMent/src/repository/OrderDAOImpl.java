package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import dto.*;

public class OrderDAOImpl implements Orders {

    @Override
    public int orderAdd(OrderDTO dto, String id) {
        String sql = """
                    INSERT INTO user_orders (userId, orderList, orderNum, price)
                    VALUES (?, ?, ?, ?)
                """;

        try (Connection conn = DBUtil.getMysqlConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, dto.getOrderList());
            pstmt.setInt(3, dto.getOrderNum());
            pstmt.setInt(4, dto.getPrice());

            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "레코드 추가 성공" : "레코드 추가 실패");
            return result;

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int orderMod(OrderDTO dto, String userId) {
        int result = 0;
        try {
            String sql = "update user_orders set userId=?, orderList=?, orderNum=?, price=?" +
                    "where userId = ?";

            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, dto.getOrderList());
            pstmt.setInt(3, dto.getOrderNum());
            pstmt.setInt(4, dto.getPrice());
            pstmt.setString(5, userId);

            result = pstmt.executeUpdate();
            System.out.println("업데이트 완료");

        } catch (SQLException e) {
            System.out.println("DB 동작 에러!!");
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public int orderDel(String userId) {
        int result = 0;

        try {
            String sql = """
                    DELETE FROM user_orders
                    WHERE orderList = ?
                    """;
            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, userId);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("DB작업 실패!");
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public List<OrderDTO> orderAll(String userId) {
        List<OrderDTO> list = new ArrayList<>();

        try {

            String sql = """
                    select * from user_orders
                    where userId = ?
                    """;

            PreparedStatement pstmt = DBUtil.getMysqlConnection().prepareStatement(sql);
            pstmt.setString(1, userId);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                new UserDTO();
                list.add(OrderDTO.builder()
                        .id(rs.getLong("id"))
                        .userId(rs.getString("userId"))
                        .orderList(rs.getString("orderList"))
                        .orderNum(rs.getInt("orderNum"))
                        .price(rs.getInt("price"))
                        .build());
            }
        } catch (SQLException e) {
            System.out.println("DB 동작 에러!!");
            System.out.println(e.getMessage());
        }

        return list;
    }

}
