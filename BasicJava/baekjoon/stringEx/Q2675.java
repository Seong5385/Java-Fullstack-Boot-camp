package baekjoon.stringEx;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            System.out.println(
                    str.chars().mapToObj(c -> String.valueOf((char) c).repeat(count)).collect(Collectors.joining()));
        }
    }
}
