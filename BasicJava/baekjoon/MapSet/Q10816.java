package baekjoon.MapSet;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        Map<Integer, Integer> countMap = Arrays.stream(br.readLine().split(" ")).collect(Collectors.groupingBy(
                Integer::parseInt,
                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n2; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(countMap.getOrDefault(target, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
