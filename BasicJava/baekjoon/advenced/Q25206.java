package baekjoon.advenced;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Q25206 {
    public static void main(String[] args) throws IOException {

        @SuppressWarnings("unused")
        Map<String, Double> gradeMap = Stream.of(new Object[][] {
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

    }
}
