package loop.quiz;

import java.util.Scanner;

public class Quiz1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        while (c < 10) {
            System.out.printf("%d X %d = %d\n", n, c, n * c);
            c++;
        }
        in.close();
    }
}
