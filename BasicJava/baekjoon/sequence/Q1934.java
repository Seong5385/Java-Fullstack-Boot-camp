package baekjoon.sequence;

import java.util.*;
import java.io.*;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            sb.append((num1 * num2) / gcd(num1, num2)).append("\n");
        }

        System.out.println(sb);

    }

    static int gcd(int a, int b) { // 6 10

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
