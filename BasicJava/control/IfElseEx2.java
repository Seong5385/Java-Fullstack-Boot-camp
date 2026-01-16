package control;

import java.io.*;

public class IfElseEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("점수를 입력하세요: ");
        int score = Integer.parseInt(br.readLine());

        if (score >= 95)
            System.out.println("A+");
        else if (score >= 90)
            System.out.println("A");
        else if (score >= 85)
            System.out.println("B+");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 75)
            System.out.println("C+");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 65)
            System.out.println("D+");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");

    }
}
