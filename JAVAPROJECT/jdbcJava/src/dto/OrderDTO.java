package dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString(exclude = "orderDate")
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private long id;
    private String userId;
    private String orderList;
    private int orderNum;
    private int price;
    private String orderDate;
}
