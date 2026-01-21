package baekjoon.sorted;

import java.util.*;
import java.io.*;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> num = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(num);

        for (int x : num) {
            sb.append(x).append("\n");
        }

        System.out.println(sb);
    }
}
