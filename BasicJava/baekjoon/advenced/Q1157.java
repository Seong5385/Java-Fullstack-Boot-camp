package baekjoon.advenced;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Long> count = new String(br.readLine()).chars().mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(
                        Character::toUpperCase, Collectors.counting()));

        List<Character> re = count.entrySet().stream()
                .filter(v -> v.getValue() == count.values().stream().mapToLong(Long::longValue).max().orElse(0))
                .map(Entry::getKey)
                .collect(Collectors.toList());

        if (re.size() > 1)
            System.out.println("?");
        else
            System.out.println(re.get(0));

    }
}
