package service.orderManage;

import dto.*;
import java.util.List;

import domain.Entity.*;

public interface OrderManage {
    boolean createOrder(OrderDTO order, UsersVO usersVO);

    boolean modOrder(OrderDTO order, UserDTO userDTO);

    boolean delOrder(OrderDTO order, UserDTO userDTO);

    List<OrderDTO> findList(UserDTO user);
}
