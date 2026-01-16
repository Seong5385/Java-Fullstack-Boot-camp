package baekjoon.advenced;

import java.io.*;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // if (s.length() % 2 != 0) {
        // StringBuilder sb = new StringBuilder(s.substring((s.length() / 2) + 1,
        // s.length())).reverse();
        // if (s.substring(0, s.length() / 2).equals(sb.toString())) {
        // System.out.println(1);
        // } else {
        // System.out.println(0);
        // }
        // }

        // else {
        // StringBuilder sb = new StringBuilder(s.substring(s.length() / 2,
        // s.length())).reverse();
        // if (s.substring(0, s.length() / 2).equals(sb.toString()))
        // System.out.println(1);
        // else
        // System.out.println(0);
        // }

        boolean isPal = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPal = false;
                break;
            }
        }

        if (isPal)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
