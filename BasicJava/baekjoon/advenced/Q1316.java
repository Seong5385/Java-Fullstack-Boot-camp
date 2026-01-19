package baekjoon.advenced;

import java.io.*;
import java.util.*;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            str.chars().mapToObj(c -> (char) c).filter(c -> c.equals(c)).forEach(System.out::println);
            ;
        }
    }
}
