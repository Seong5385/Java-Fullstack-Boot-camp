package baekjoon.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        if (i != 0) {
            System.out.println(str.charAt(i - 1));
        }

    }
}
