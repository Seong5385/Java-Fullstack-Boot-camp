package loop.quiz;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p;
        boolean state = true;
        do {
            System.out.print("출금액을 입력하세요: ");
            p = in.nextInt();

            System.out.println();

            if (p < 0) {
                System.out.println("0보다 커야합니다 다시 입력하십시오.\n");
                continue;
            }

            if (p >= 1000000) {
                System.out.println("최대 출금 한도는 100만원 입니다.\n");
                continue;
            }

            if (p % 1000 != 0) {
                System.out.println("금액은 1000원 단위여야 합니다.\n");
                continue;
            }

            System.out.println("출금 완료 했습니다.");
            state = false;

        } while (state);

        in.close();
    }
}
