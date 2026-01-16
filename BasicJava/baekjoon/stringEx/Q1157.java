package baekjoon.stringEx;

import java.io.*;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();

        for (char n : s)
            System.out.println(n);
    }
}
