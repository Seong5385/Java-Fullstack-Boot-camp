package calc.quiz;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] re = new int[100];

        for (int i = 1; i <= re.length; i++) {
            if (isPrime(i)) {
                re[i - 1] = i;
            }
        }

        for (int n : re)
            System.out.print(n + " ");

        in.close();
    }

    public static boolean isPrime(int n) {
        // 1 이하는 소수가 아님
        if (n <= 1)
            return false;

        // 2는 소수
        if (n == 2)
            return true;

        // 짝수는 소수가 아님 (2 제외)
        if (n % 2 == 0)
            return false;

        // 3부터 숫자의 제곱근까지만 나누어 떨어지는지 확인
        // i += 2를 통해 홀수만 검사 (효율성)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }

        return true;
    }
}
