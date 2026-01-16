package baekjoon.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        IntStream.range(0, n).mapToObj(i -> readLine(br)).map(Q9086::firstAndLast).forEach(System.out::println);
    }

    private static String readLine(BufferedReader br) {
        try {
            return br.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String firstAndLast(String s) {
        return s.charAt(0) + "" + s.charAt(s.length() - 1);
    }
}
