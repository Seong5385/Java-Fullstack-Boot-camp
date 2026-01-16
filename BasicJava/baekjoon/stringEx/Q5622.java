package baekjoon.stringEx;

import java.io.*;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;

        String[] dial = {
                "",
                "",
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ"
        };

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            for (int j = 0; j < dial.length; j++) {
                if (dial[j].contains(s) == true) {
                    result += j + 1;
                }
            }
        }
        System.out.println(result);

        // System.out.println(
        // str.chars().map(c -> IntStream.range(0, dial.length).filter(j ->
        // dial[j].indexOf(c) != -1).findFirst() //
        // .orElse((-1) + 1)).sum());
    }
}
