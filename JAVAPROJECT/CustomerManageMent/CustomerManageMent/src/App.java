import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.OrderManageController;
import controller.UserManageController;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        UserManageController userInfo = new UserManageController();
        OrderManageController order = new OrderManageController();

        System.out.print("아이디를 입력하세요: ");
        String userId = br.readLine();

        System.out.print("비밀번호를 입력하세요: ");
        String userPw = br.readLine();

        if (userInfo.login(userId, userPw)) {
            System.out.println("로그인 성공");

            while (true) {
                System.out.print("명령어를 입력하세요(M: 갱신, D: 삭제, A: 출력, K: 카트, Q: 종료): ");
                String cmd = br.readLine().toUpperCase();

                switch (cmd) {
                    case "M" -> userInfo.userMod(userId);
                    case "D" -> {
                        userInfo.delUser();
                        System.out.println("앱을 종료합니다.");
                        return;
                    }
                    case "A" -> userInfo.userInfo();
                    case "K" -> orderDashBoard(order, userId);
                    case "Q" -> {
                        System.out.println("종료");
                        return;
                    }
                }
            }
        }

        else {
            System.out.println("회원가입을 시작합니다.");
            userInfo.register();
        }

    }

    public static void orderDashBoard(OrderManageController order, String userId) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        System.out.println("카트에 들어왔습니다");

        while (true) {

            System.out.print("명령어를 입력하세요(KA: 주문 추가, KU: 주문 갱신, KD 주문 삭제 KL: 주문 리스트, Q: 나가기): ");
            String cmd = br.readLine().toUpperCase();

            switch (cmd) {
                case "KA" -> order.orderAdd(userId);
                case "KU" -> order.modOrder(userId);
                case "KD" -> order.orderDel();
                case "KL" -> {
                    System.out.println("=".repeat(30) + "카트" + "=".repeat(30));
                    order.orderList(userId);
                }
                case "Q" -> {
                    System.out.println("카트를 나갑니다.");
                    return;
                }
            }
        }
    }
}
