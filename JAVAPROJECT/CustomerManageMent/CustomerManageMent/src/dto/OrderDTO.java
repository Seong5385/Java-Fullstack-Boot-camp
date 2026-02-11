package dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private long id;
    private String userId; //
    private String orderList; //
    private int orderNum; //
    private int price; //
    private String orderDate;

    @Override
    public String toString() {
        return """
                Order {
                    id        = %d
                    userId    = %s
                    orderList = %s
                    orderNum  = %d
                    price     = %d
                    orderDate = %s
                }
                """.formatted(
                id, userId, orderList, orderNum, price, orderDate);
    }

}
