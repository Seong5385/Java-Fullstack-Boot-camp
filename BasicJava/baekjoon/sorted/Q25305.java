package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        List<Integer> num = new ArrayList<>();
        int n = Integer.parseInt(st1.nextToken());
        int cnt = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(num, Collections.reverseOrder());

        System.out.println(num.get(cnt - 1));

    }
}
