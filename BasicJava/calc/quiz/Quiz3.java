package calc.quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((in.nextInt() >= 60) ? "pass" : "fail");

        in.close();
    }
}
