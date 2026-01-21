package baekjoon.sorted;

import java.util.*;
import java.io.*;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(num);
        // Arrays.stream(br.readLine().split("
        // ")).mapToInt(Integer::parseInt).sorted().boxed()
        // .collect(Collectors.toList());

        System.out.println(num.stream().mapToInt(i -> i).sum() / num.size());
        System.out.println(num.get(2));
    }
}
