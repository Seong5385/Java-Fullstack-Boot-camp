package baekjoon.sequence;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")

public class Q2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        gcdFind(numbers);
    }

    private static void gcdFind(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) - numbers.get(i - 1));
        }

    }

    private static int gcd(int a, int b) {
        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }
}
