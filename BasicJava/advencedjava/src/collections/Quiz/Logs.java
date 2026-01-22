package collections.quiz;

import java.util.*;
import java.util.stream.Collectors;

public class Logs {
    public static void main(String[] args) {
        String[] logs = { "user1", "user2", "user1", "user3", "user2", "user4" };

        Set<String> user = Arrays.stream(logs).collect(Collectors.toSet());
        System.out.println("방문자");
        user.forEach(System.out::println);

        System.out.println();
        System.out.println("방문자 수: " + user.size() + "명");
    }
}
