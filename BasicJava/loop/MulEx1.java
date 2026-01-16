package loop;

import java.util.Scanner;

public class MulEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int j = 1; j < 10; j++) {
            System.out.printf("%d X %d = %d\n", n, j, n * j);
        }
        System.out.println();

        in.close();
    }
}
