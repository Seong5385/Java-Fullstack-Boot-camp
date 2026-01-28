package baekjoon.sequence;

import java.util.*;
import java.io.*;

public class Q13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.println((n * m) / gcd(n, m));

    }

    static long gcd(long a, long b) {

        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }
}
