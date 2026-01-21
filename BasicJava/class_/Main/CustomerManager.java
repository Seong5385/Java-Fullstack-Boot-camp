package class_.Main;

import java.util.*;
import java.io.*;

import class_.classes.Customer;

public class CustomerManager {

    private static final List<Customer> db = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("명령어를 입력하세요.");

        while (true) {
            System.out.print("I(입력), D(삭제), U(갱신), P(부분 출력), PA(모두 출력), Q(종료): ");
            String cmd = br.readLine().toUpperCase();

            switch (cmd) {
                case "I" -> insert(br);
                case "D" -> delete(br);
                case "U" -> update(br);
                case "P" -> customerPrint(br);
                case "PA" -> printAll();
                case "R" -> rankSearch(br);
                case "Q" -> {
                    System.out.println("\n프로그램 종료");
                    return;
                }
            }
        }
    }

    public static void insert(BufferedReader br) throws IOException {
        System.out.print("\n이름을 입력하세요: ");
        String name = br.readLine();

        System.out.print("성별을 입력하세요(M/F): ");
        char gender = br.readLine().toUpperCase().charAt(0);

        System.out.print("이메일을 입력하세요: ");
        String email = br.readLine();

        System.out.print("출생년도를 입력하세요: ");
        int birth = Integer.parseInt(br.readLine());

        System.out.print("등급을 입력하세요: ");
        String rank = br.readLine();

        db.add(new Customer(name, gender, email, birth, rank));
        System.out.println("\n입력되었습니다.");
    }

    public static void delete(BufferedReader br) throws IOException {
        System.out.println("\n데이터를 삭제하려면 이름을 입력하십시오.");
        System.out.print("삭제할 데이터의 이름을 입력하세요: ");
        String name = br.readLine();

        db.removeIf(customer -> customer.getName().equals(name));
    }

    public static void update(BufferedReader br) throws IOException {
        System.out.print("\n업데이트를 할 데이터의 이름을 입력하세요: ");
        String name = br.readLine();

        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getName().equals(name)) {
                System.out.println("기존 이름은: " + db.get(i).getName());
                System.out.println("기존 성별은: " + db.get(i).getGender());
                System.out.println("기존 이메일은: " + db.get(i).getEmail());
                System.out.println("기존 생년월일은: \n" + db.get(i).getBirth());

                System.out.print("\n이름을 입력하세요: ");
                String updateName = br.readLine();

                System.out.print("성별을 입력하세요(M/F): ");
                char updatGender = br.readLine().toUpperCase().charAt(0);

                System.out.print("이메일을 입력하세요: ");
                String updateEmail = br.readLine();

                System.out.print("출생년도를 입력하세요: ");
                int updateBirth = Integer.parseInt(br.readLine());

                System.out.print("등급을 입력하세요: ");
                String rank = br.readLine();

                db.get(i).updateData(updateName, updatGender, updateEmail, updateBirth, rank);

                System.out.println("\n갱신을 완료했습니다.");
            }
        }
    }

    public static void customerPrint(BufferedReader br) throws IOException {
        while (true) {
            System.out.print("\n출력할 데이터의 이름을 입력하세요: ");
            String name = br.readLine();

            if (!name.isEmpty()) {
                db.stream().filter(customer -> customer.getName().equals(name)).forEach(System.out::println);
                break;
            } else if (name.isEmpty())
                System.out.println("이름을 입력하세요");
        }
    }

    public static void rankSearch(BufferedReader br) throws IOException {
        System.out.println();
    }

    public static void printAll() {
        if (db.isEmpty())
            System.out.println("\n출력할 데이터가 없습니다 입력 먼저 해주십시오\n");

        else
            db.forEach(System.out::println);
    }

}