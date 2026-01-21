package baekjoon.sorted;

import java.io.*;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int temp = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if (temp == 0) {
                temp = number;
            }

            if (temp > number) {
                temp = number;
            }

            result = temp;
            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }
}
