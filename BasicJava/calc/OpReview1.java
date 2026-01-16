package calc;

import java.util.Scanner;
import java.util.stream.IntStream;

public class OpReview1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("몇 단을 출력하실건가요?: ");
        int n = in.nextInt();
        int[] re1 = new int[9];

        for (int i = 0; i < re1.length; i++)
            re1[i] = n * (i + 1);

        for (int r : re1)
            System.out.print(r + " ");
        System.out.println();

        // stream 사용
        int[] re2 = IntStream.rangeClosed(1, 9).map(b -> b * n).toArray(); // map() 계산 도와주는 메서드

        for (int re : re2)
            System.out.print(re + " ");

        System.out.println();

        int[][] re3 = IntStream.rangeClosed(1, 9) // range()는 끝값 포함 x, rangeClosed()는 끝값 포함
                .mapToObj(a -> IntStream.rangeClosed(1, 9).map(r -> a * r).toArray())
                .toArray(int[][]::new);

        for (int[] a : re3) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println(re3[in.nextInt() - 1][in.nextInt() - 1]);

        in.close();
    }
}