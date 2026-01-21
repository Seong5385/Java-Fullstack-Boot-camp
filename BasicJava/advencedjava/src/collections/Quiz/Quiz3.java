package collections.quiz;

import java.util.*;

class MemberEx {
    private String id;
    private String name;
    private int age;

    MemberEx(String i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        MemberEx m1 = new MemberEx("hong", "홍길동", 30);
        MemberEx m2 = new MemberEx("lee", "이순신", 40);
        MemberEx m3 = new MemberEx("kim", "김유신", 50);

        List<MemberEx> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);

        for (MemberEx mem : memberList) {
            System.out.printf("%s,%s,%d\n", mem.getId(), mem.getName(), mem.getAge());
        }

    }
}
