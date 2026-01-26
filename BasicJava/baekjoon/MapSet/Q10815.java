package baekjoon.MapSet;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Q10815 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n1 = Integer.parseInt(br.readLine());
        Set<Integer> card1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toSet());

        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n2; i++) {
            if (card1.contains(Integer.parseInt(st.nextToken()))) {
                sb.append(1);
            }

            else {
                sb.append(0);
            }

            if (i != n2 - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
