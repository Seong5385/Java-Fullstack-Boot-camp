package baekjoon.advenced;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int k = 4; k > i; k--) { // 3번 별 찍기와 동일
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) { // 별이 1, 3, 5, 7, 9번 출력되어야 하므로 변수를 하나 만든다.
                System.out.print("*");
            }
            num = num + 2; // 1, 3, 5, 7, 9번 출력될 수 있도록 변수에 2를 더해주어 계속 홀수로 만들어준다.
            System.out.println();
        }
        in.close();
    }
}
