package service.orderManage;

import java.util.List;

import dto.OrderDTO;
import repository.Orders;
import repository.OrderDAOImpl;

public class OrderManageImpl implements OrderManage {

    Orders orderRepository = new OrderDAOImpl();

    @Override
    public boolean createOrder(OrderDTO order, String id) {
        orderRepository.orderAdd(order, id);
        return true;
    }

    @Override
    public boolean modOrder(OrderDTO order, String userId) {
        orderRepository.orderMod(order, userId);
        return true;
    }

    @Override
    public boolean delOrder(String s) {
        orderRepository.orderDel(s);
        return true;
    }

    @Override
    public List<OrderDTO> findList(String userId) {
        return orderRepository.orderAll(userId);
    }
}
