package baekjoon.sorted;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Q18870 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> numbers = Arrays.stream(num).distinct().sorted()
                .boxed()
                .collect(Collectors.toList());

        Map<Integer, Integer> map = IntStream.range(0, numbers.size())
                .boxed()
                .collect(Collectors.toMap(numbers::get, i -> i));

        for (int i = 0; i < num.length; i++) {
            sb.append(map.get(num[i])).append(" ");
        }

        System.out.println(sb);
    }
}
