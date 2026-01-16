package baekjoon.advenced;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();

        @SuppressWarnings("unused")
        Map<Character, Long> count = new String(s).chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(
                        Character::toUpperCase, Collectors.counting()));

    }
}
