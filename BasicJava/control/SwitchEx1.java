package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String food = in.next();
        switch (food) {
            case "udong" -> System.out.println("역전우동 가셈");
            case "kimbab" -> System.out.println("김천 가셈");
            case "sunde" -> System.out.println("순대국밥집 가셈");
            default -> System.out.println("편점가 그냥");
        }

        in.close();
    }
}
