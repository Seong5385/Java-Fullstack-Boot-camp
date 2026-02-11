package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import dto.OrderDTO;
import dto.UserDTO;
import service.orderManage.OrderManage;
import service.orderManage.OrderManageImpl;

public class OrderManageController {
    private OrderManage orderService = new OrderManageImpl();

    private OrderDTO orderInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        System.out.print("주문 내용을 입력하세요: ");
        String orderList = br.readLine();

        int n = new Random().nextInt(99) + 1;

        System.out.print("가격을 입력하세요: ");
        int price = Integer.parseInt(br.readLine());

        return OrderDTO.builder().userId(new UserDTO().getUserId()).orderList(orderList).orderNum(n).price(price)
                .build();
    }

    public void orderAdd(String id) throws IOException {
        boolean input = orderService.createOrder(orderInput(), id);
        if (input)
            System.out.println("주문 추가 완료");
    }

    public void modOrder(String id) throws IOException {
        boolean update = orderService.modOrder(orderInput(), id);
        if (update)
            System.out.println("주문 업데이트 완료");
    }

    public void orderDel() throws IOException {
        System.out.print("제품을 입력하세요: ");

        boolean del = orderService.delOrder(new BufferedReader(new InputStreamReader(System.in, "cp949")).readLine());
        if (del) {
            System.out.println("삭제 완료");
        }
    }

    public void orderList(String userId) {
        orderService.findList(userId).forEach(System.out::println);

    }
}
