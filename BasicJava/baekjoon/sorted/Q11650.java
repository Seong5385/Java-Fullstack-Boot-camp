package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(new StringBuilder().append(x.get(i)).append(" ").append(y.get(i)));
        }
    }
}