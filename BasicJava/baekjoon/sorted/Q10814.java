package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        persons.stream().sorted(Comparator.comparingInt(Person::getAge))
                .forEach(s -> sb.append(s.getAge()).append(" ").append(s.getName()).append("\n"));

        System.out.println(sb);

    }
}

class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
