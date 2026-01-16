package baekjoon.stringEx;

import java.io.*;
import java.util.*;

public class Q11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // List<String> str = Arrays.stream(br.readLine().split(" ")).filter(s ->
        // s.isBlank() == false)
        // .collect(Collectors.toList());

        // System.out.println(str.size());

        System.out.println(new StringTokenizer(br.readLine()).countTokens());
    }
}
