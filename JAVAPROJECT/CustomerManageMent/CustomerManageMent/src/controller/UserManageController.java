package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dto.UserDTO;
import service.userManage.UserManage;
import service.userManage.UserManageImpl;

public class UserManageController {
    private UserManage userService = new UserManageImpl();

    private UserDTO userInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        System.out.print("아이디를 입력하세요: ");
        String userId = br.readLine();

        System.out.print("비밀번호를 입력하세요: ");
        String userPw = br.readLine();

        System.out.print("이름을 입력하세요: ");
        String userName = br.readLine();

        System.out.print("이메일를 입력하세요: ");
        String userEmail = br.readLine();

        System.out.print("전화번호 앞자리를 입력하세요: ");
        String phone1 = br.readLine();

        System.out.print("전화번호 뒷자리를 입력하세요: ");
        String phone2 = br.readLine();

        System.out.print("나이를 입력하세요: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("주소를 입력하세요(시, 군): ");
        String addr1 = br.readLine();

        System.out.print("주소를 입력하세요(구, 읍, 동): ");
        String addr2 = br.readLine();

        return UserDTO.builder().userId(userId).userPw(userPw).userName(userName).userEmail(userEmail).phone1(phone1)
                .phone2(phone2)
                .age(age).addr1(addr1).addr2(addr2).build();
    }

    public void register() throws IOException {
        userService.userAdd(userInput());
    }

    public void userInfo() throws IOException {
        userService.searchUserIdName().forEach(System.out::println);
    }

    public void userMod(String oldUserId) throws IOException {
        userService.modUser(userInput(), oldUserId);
    }

    public void delUser() throws IOException {
        System.out.println("탈퇴 합니다.");
        userService.userDel();
    }

    public boolean login(String id, String pw) throws IOException {
        if (userService.userLogin(id, pw))
            return true;

        return false;
    }
}
