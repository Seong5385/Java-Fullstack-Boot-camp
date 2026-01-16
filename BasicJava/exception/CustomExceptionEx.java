package exception;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class CustomExceptionEx {
    public static final List<Member> dataBase = new ArrayList<Member>();

    public static void main(String[] args) {

    }

    public static void insert(Member member) throws InsertException {
        try {
            dataBase.forEach(x -> {
                if (dataBase.isEmpty() == false) {
                    if (x.getName().equals(member.getName())) {
                        throw new InsertException("이름이 중복됩니다");
                    }
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
    InsertException(String msg) {
        super(msg);
    }
}
