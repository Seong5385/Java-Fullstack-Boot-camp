import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import domain.Entity.UsersVO;
import repository.*;

public class UsersManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        UserDAOImpl info = new UserDAOImpl();

        while (true) {
            System.out.print("명령어를 입력하세요(I: 입력, M: 갱신, D: 삭제, A: 모두 출력, IN: 부분 출력, EP: 이메일로 출력, Q: 종료): ");
            String cmd = br.readLine().toUpperCase();

            switch (cmd) {
                case "I" -> info.userAdd(new UsersVO());
                case "M" -> info.userMod(new UsersVO(), new UsersVO());
                case "D" -> info.userDel(new UsersVO());
                case "A" -> info.userAll().forEach(System.out::println);
                case "IN" -> info.userSearchIdName().forEach(System.out::println);
                case "EP" -> {
                    System.out.print("이메일을 입력하세요: ");

                    info.userSearchEmail(br.readLine()).forEach(System.out::println);
                }
                case "Q" -> {
                    System.out.println("종료");
                    return;
                }
            }
        }
    }
}
