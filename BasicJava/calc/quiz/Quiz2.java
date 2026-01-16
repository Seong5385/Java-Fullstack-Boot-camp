package calc.quiz;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt() % 2 == 0) ? "짝수" : "홀수");

        sc.close();
    }
}
