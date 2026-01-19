package api.quiz;

import java.io.*;
import java.util.*;

public class Quiz6 {

    private static final List<UserProfile> db = new ArrayList<>();

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {

                UserProfile user = new UserProfile();

                System.out.print("이름을 입력하세요: ");
                user.setName(br.readLine());

                System.out.print("이메일을 입력하세요: ");
                user.setEmail(br.readLine());

                db.add(user);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력해주세요.\n");
                continue;
            } finally {
                System.out.print("계속 입력하시겠습니까?(Y/N): ");
                if (br.readLine().toUpperCase().equals("N"))
                    break;

                System.out.println();
            }
        }

        db.forEach(o -> System.out.println(o));

    }
}

class UserProfile {
    private String name;
    private String email;

    public void setName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("\n입력된 이름이 없습니다.");
        }

        else {
            this.name = name;
        }
    }

    public void setEmail(String email) throws Exception {
        if (email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("\n입력된 이메일이 없습니다.");
        }

        else {
            this.email = email;
        }
    }

    public String toString() {
        return String.format(
                "[" + this.name + ", " + this.email + "]");
    }
}
