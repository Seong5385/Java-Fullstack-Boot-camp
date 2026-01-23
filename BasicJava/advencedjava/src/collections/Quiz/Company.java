package collections.quiz;

import java.util.*;

public class Company {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();

        employee.put("이순신", "1");
        employee.put("홍길동", "2");
        employee.put("강감찬", "3");

        employee.entrySet().stream().filter(o -> o.getKey().equals("이순신")).forEach(System.out::println);

        System.out.println();
        System.out.println("홍길동 퇴사");
        employee.entrySet().removeIf(o -> o.getKey().equals("홍길동"));
        employee.entrySet().forEach(System.out::println);
    }
}
