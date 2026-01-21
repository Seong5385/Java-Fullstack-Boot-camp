package class_.classes;

import interface_.Rank;

public class Customer implements Rank {
    private String name;
    private char gender;
    private String email;
    private int birth;
    private String rank;

    public Customer(String n, char g, String e, int b, String rank) {
        this.name = n;
        this.gender = g;
        this.email = e;
        this.birth = b;
        this.rank = rank;
    }

    public void updateData(String na, char ge, String em, int bi, String rank) {
        this.name = na;
        this.gender = ge;
        this.email = em;
        this.birth = bi;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "[이름: " + name + ", 성별: " + gender + ", 이메일: " + email + ", 생년월일: " + birth + ", 등급: " + rank + "]\n";
    }

}
