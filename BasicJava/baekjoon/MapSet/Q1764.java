package baekjoon.MapSet;

import java.io.*;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer count = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(count.nextToken());
        int m = Integer.parseInt(count.nextToken());

        List<String> noExist = new ArrayList<>();
        Set<String> name = new HashSet<>();

        for (int i = 0; i < n; i++) {
            name.add(br.readLine());
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            if (name.contains(s)) {
                cnt++;
                noExist.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(cnt);
        noExist.stream().sorted().forEach(s -> sb.append(s).append("\n"));

        System.out.println(sb);

    }

}
