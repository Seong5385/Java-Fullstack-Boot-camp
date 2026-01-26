package baekjoon.MapSet;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer count = new StringTokenizer(br.readLine());

        int setCount = Integer.parseInt(count.nextToken());
        int gum = Integer.parseInt(count.nextToken());
        int result = 0;

        Set<String> setName = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toSet());

        StringTokenizer input = new StringTokenizer(br.readLine());
        while (input.hasMoreTokens()) {
            if (setName.stream().anyMatch(str -> str.contains(input.nextToken())))
                result++;
        }

        System.out.println(result);

    }
}
