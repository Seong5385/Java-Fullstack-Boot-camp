package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class StreamEx1 {

    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        users.add(new User("홍길동", 24, "hong1234@naver.com"));
        users.add(new User("강감찬", 27, "gang2345@naver.com"));
        users.add(new User("이순신", 29, "lee124@naver.com"));
        users.add(new User("유관순", 29, "you6678@naver.com"));
        users.add(new User("안중근", 31, "an4567@naver.com"));

        List<String> email = users.stream().filter(user -> user.getEmail() != "").map(User::getEmail)
                .collect(Collectors.toList());
        email.forEach(System.out::println);
    }
}

class User {
    private String name;
    private int age;
    private String email;
    private boolean active;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

}
