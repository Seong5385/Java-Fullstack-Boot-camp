package baekjoon.MapSet;

import java.io.*;
import java.util.*;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> pokeNum = new HashMap<>();
        Map<Integer, String> pokeName = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokeNum.put(name, i);
            pokeName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(pokeName.get(Integer.parseInt(s))).append("\n");
            }

            else {
                sb.append(pokeNum.get(s)).append("\n");
            }
        }

        System.out.println(sb);

    }

}
