package baekjoon.MapSet;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Q1269 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer count = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(count.nextToken());
        int m = Integer.parseInt(count.nextToken());

        Set<Integer> a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toSet());
        Set<Integer> b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toSet());

        List<Integer> result = new ArrayList<>();
        a.stream().filter(num -> !b.contains(num)).forEach(result::add);
        b.stream().filter(num -> !a.contains(num)).forEach(result::add);

        System.out.println(result.size());

    }
}
