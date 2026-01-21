package baekjoon.advenced;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Q25206 {

    private static final Map<String, Double> gradeMap = Stream.of(new Object[][] {
            { "A+", 4.5 },
            { "A0", 4.0 },
            { "B+", 3.5 },
            { "B0", 3.0 },
            { "C+", 2.5 },
            { "C0", 2.0 },
            { "D+", 1.5 },
            { "D0", 1.0 },
            { "F", 0.0 }
    }).collect(Collectors.toMap(
            e -> (String) e[0],
            e -> (Double) e[1]));

    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        double totalScore = 0;
        double totalgrade = 0;

        while (count < 20) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                totalScore += credit * gradeMap.get(grade);
                totalgrade += credit;
            }
            count++;
        }

        System.out.printf("%.6f", totalScore / totalgrade);

    }
}
