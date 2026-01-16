package calc.quiz;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt() + in.nextInt();
        System.out.println((sum) % 3 == 0 ? sum : "");

        in.close();
    }
}
