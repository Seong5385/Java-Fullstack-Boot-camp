package calc;

import java.util.Random;
import java.util.Scanner;

public class OpReviewEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new Random().ints(1, 101).distinct().limit(10).toArray();

        int i = in.nextInt();
        int count = 0;

        System.out.println("수를 입력하세요.");
        while (true) {
            int n = in.nextInt();

            if (n > arr[i]) {
                System.out.println("Down");
                System.out.print("수를 다시 입력하세요: ");
                count++;
            }

            if (n < arr[i]) {
                System.out.println("Up");
                System.out.print("수를 다시 입력하세요: ");
                count++;
            }

            if (n == arr[i]) {
                System.out.println();
                System.out.printf("답은 %d입니다\n", arr[i]);
                System.out.printf("시도 횟수: %d번", count);
                break;
            }
        }

        in.close();
    }
}
