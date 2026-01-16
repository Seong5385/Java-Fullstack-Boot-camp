package baekjoon.advenced;

import java.io.*;
import java.util.Arrays;

public class Q3003 {

    private static final int[] ch = { 1, 1, 2, 2, 2, 8 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] re = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i] - re[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
