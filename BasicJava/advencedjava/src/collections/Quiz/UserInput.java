package collections.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UserInput {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> login = new HashMap<>();
        login.put("javaUser", 1234);

        String id = br.readLine();
        int pw = Integer.parseInt(br.readLine());

        login.entrySet().stream().filter(i -> i.getKey().equals(id))
                .forEach(x -> System.out.println("아이디 " + x + "는 존재합니다."));
    }
}
