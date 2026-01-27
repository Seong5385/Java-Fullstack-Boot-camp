package baekjoon.MapSet;

import java.util.*;
import java.io.*;

public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine().chars().mapToObj(c -> (char) c).forEach(c -> System.out.println(sb.append(c)));

    }
}
