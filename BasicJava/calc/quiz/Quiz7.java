package calc.quiz;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(n - (n % 100));

        in.close();
    }
}
