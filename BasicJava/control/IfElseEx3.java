package control;

import java.io.*;
import java.util.StringTokenizer;

public class IfElseEx3 {
    public static void main(String[] args) throws IOException {
        System.out.print("수학 영어 점수를 순서대로 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (m >= 60 && e >= 60) {
            bw.write("성적은: ");
            bw.write("Pass");
            bw.close();
        } else {
            bw.write("성적은: ");
            bw.write("Fail");
            bw.close();
        }

    }
}
