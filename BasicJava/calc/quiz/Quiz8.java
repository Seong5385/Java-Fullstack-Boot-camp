package calc.quiz;

import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean check = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
            }
        }

        if (check)
            System.out.println("소수");
        else
            System.out.println("소수 아님");
        in.close();
    }
}
