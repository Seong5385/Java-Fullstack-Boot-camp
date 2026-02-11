package service.orderManage;

import dto.*;
import java.util.List;

public interface OrderManage {
    boolean createOrder(OrderDTO order, String id);

    boolean modOrder(OrderDTO order, String id);

    boolean delOrder(String order);

    List<OrderDTO> findList(String userId);
}
