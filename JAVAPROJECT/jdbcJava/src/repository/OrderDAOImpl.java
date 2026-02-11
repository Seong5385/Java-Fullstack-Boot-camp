package repository;

import java.sql.*;

import dbutil.DBUtil;
import domain.Entity.OrdersVO;

public class OrderDAOImpl implements Orders {

    @Override
    public int orderAdd(OrdersVO vo) {
        String sql = """
                    INSERT INTO orders (userId, orderList, orderNum, price)
                    VALUES (?, ?, ?, ?)
                """;

        try (Connection conn = DBUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, vo.getUserId());
            pstmt.setString(2, vo.getOrderList());
            pstmt.setInt(3, vo.getOrderNum());
            pstmt.setInt(4, vo.getPrice());

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
    public int orderMod(OrdersVO vo) {
        return 0;
    }

    @Override
    public int orderDel(OrdersVO vo) {
        return 0;
    }

    @Override
    public Orders orderAll() {
        return null;
    }

}
