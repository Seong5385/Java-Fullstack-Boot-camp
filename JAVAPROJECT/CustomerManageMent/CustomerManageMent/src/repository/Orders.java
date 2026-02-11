package repository;

import dto.*;
import java.util.List;

public interface Orders {
    int orderAdd(OrderDTO dto, String id);

    int orderMod(OrderDTO dto, String userId);

    int orderDel(String n);

    List<OrderDTO> orderAll(String userId);
}
