package baekjoon.sequence;

import java.util.*;
import java.io.*;

public class Q1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] numbers = new int[2][2];

        for (int i = 0; i < 2; i++) {
            numbers[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int n = (numbers[0][0] * numbers[1][1]) + (numbers[1][0] * numbers[0][1]);
        int m = numbers[0][1] * numbers[1][1];

        sb.append(n / gcd(n, m)).append(" ")
                .append(m / gcd(n, m));
        System.out.println(sb);
    }

    static int gcd(int a, int b) { // 6 10

        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }
}
