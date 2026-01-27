package stream;

import java.util.*;

public class StreamEx4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("홍길동", 24, "hong1234@naver.com"));
        users.add(new User("강감찬", 27, "gang2345@naver.com"));
        users.add(new User("이순신", 29, "lee124@naver.com"));
        users.add(new User("유관순", 29, "you6678@naver.com"));
        users.add(new User("안중근", 31, "an4567@naver.com"));

        System.out.println(users.stream().allMatch(User::isActive));
    }
}
