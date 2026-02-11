package repository;

import domain.Entity.OrdersVO;

public interface Orders {
    int orderAdd(OrdersVO vo);

    int orderMod(OrdersVO vo);

    int orderDel(OrdersVO vo);

    Orders orderAll();
}
