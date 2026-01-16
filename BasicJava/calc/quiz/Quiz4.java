package calc.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("(나이, 키, 심장질환, 부모동반여부를 차례대로 입력하세요): ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int age = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        String hearchDease = st.nextToken();
        String parent = st.nextToken();

        System.out.println(
                (age >= 6 && parent.equals("yes") && height >= 120 && hearchDease.equals("no")) ? "pass" : "nonpass");
    }
}
