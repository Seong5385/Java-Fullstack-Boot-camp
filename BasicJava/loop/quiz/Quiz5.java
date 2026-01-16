package loop.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz5 {
    public static void main(String[] args) throws IOException {
        System.out.print("계산식을 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int num2 = Integer.parseInt(st.nextToken());

        switch (op) {
            case "+" -> System.out.printf("덧셈 결과: %d", num1 + num2);
            case "-" -> System.out.printf("뺄셈 결과: %d", num1 - num2);
            case "x" -> System.out.printf("곱셈 결과: %d", num1 * num2);
            case "/" -> System.out.printf("나눗셈 결과: %.2f", (double) num1 / num2);
        }

    }
}
