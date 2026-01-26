package stream.quiz;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FilteringQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        filterEvenNum(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList()));

    }

    private static void filterEvenNum(List<Integer> num) {
        num.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
    }

}
