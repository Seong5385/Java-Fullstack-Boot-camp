package collections.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Quiz4 {

    private static final List<Person> db = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("입력(I), 검색(S), 삭제(D), 종료(Q): ");
            String cm = br.readLine().toUpperCase();

            switch (cm) {
                case "I" -> userInput(br);
                case "S" -> userSearch(br);
                case "D" -> userDelet(br);
                case "Q" -> {
                    System.out.println("종료");
                    return;
                }
            }
        }
    }

    private static void userSearch(BufferedReader br) throws IOException {
        System.out.print("\n출력할 데이터의 이름을 입력하세요: ");
        String name = br.readLine();

        db.stream().filter(customer -> customer.getName().equals(name)).forEach(System.out::println);
    }

    private static void userDelet(BufferedReader br) throws IOException {
        System.out.println("\n데이터를 삭제하려면 이름을 입력하십시오.");
        System.out.print("삭제할 데이터의 이름을 입력하세요: ");
        String name = br.readLine();

        db.removeIf(customer -> customer.getName().equals(name));
    }

    private static void userInput(BufferedReader br) throws IOException {
        while (true) {
            try {

                System.out.print("이름을 입력하세요: ");
                String name = br.readLine();

                System.out.print("나이을 입력하세요: ");
                int age = Integer.parseInt(br.readLine());
                Person user = new Person(name, age);

                db.add(user);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력해주세요.\n");
                continue;
            } finally {
                System.out.print("계속 입력하시겠습니까?(Y/N): ");
                if (br.readLine().toUpperCase().equals("N"))
                    break;

                System.out.println();
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("\n입력된 이름이 없습니다.");
        } else {
            this.name = name;
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
