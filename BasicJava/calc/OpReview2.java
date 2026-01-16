package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OpReview2 {
    public static void main(String[] args) throws IOException {
        System.out.print("몇 단과 곱한 수를 차례대로 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[][] re = new int[10][10];

        for (int i = 1; i < re.length; i++) {
            for (int j = 1; j < re.length; j++) {
                re[i][j] = i * j;
            }
        }

        System.out.printf("%d X %d = %d입니다", n1, n2, re[n1][n2]);

    }
}
