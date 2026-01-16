package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CustomExceptionEx {
    public static final List<Member> dataBase = new ArrayList<Member>();

    public static void main(String[] args) throws InsertException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        dataBase.add(new Member("홍길동", "010-1234-5678"));

        while (true) {
            st = new StringTokenizer(br.readLine());

            insert(new Member(st.nextToken(), st.nextToken()));

            if (st.nextToken().equals("quit")) {
                break;
            }
        }

    }

    public static void insert(Member member) throws InsertException {
        try {
            dataBase.forEach(x -> {
                if (dataBase.isEmpty() == false) {
                    if (x.getName().equals(member.getName())) {
                        System.out.println(new InsertException().getEqualError());
                    }
                }

                else {
                    dataBase.add(member);
                    System.out.println("값이 입력되었습니다.");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Member {
    private String name;
    private String phone;

    public Member(String name, String pNum) {
        this.name = name;
        this.phone = pNum;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

class InsertException extends Exception {
    InsertException() {
        super("입력이 잘못되었습니다.");
    }

    public String getMsg() {
        return super.getMessage();
    }

    public String getEqualError() {
        return super.getMessage() + "(같은 요소가 있습니다)";
    }
}
