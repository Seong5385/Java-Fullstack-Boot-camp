package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        num.stream().sorted().forEach(System.out::println);
    }
}
