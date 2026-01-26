package baekjoon.sorted;

import java.io.*;
import java.util.*;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        Arrays.stream(str).distinct().sorted().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
