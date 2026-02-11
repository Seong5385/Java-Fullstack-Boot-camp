package domain.Entity;

import java.sql.*;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrdersVO {
    private long id;
    private String userId;
    private String orderList;
    private int orderNum;
    private int price;
    private Timestamp orderDate;
}
