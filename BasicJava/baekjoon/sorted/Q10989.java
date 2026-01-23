package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.stream(num).sorted().forEach(x -> sb.append(x).append("\n"));
        System.out.println(sb);
    }
}
