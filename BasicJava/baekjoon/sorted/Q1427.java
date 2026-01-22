package baekjoon.sorted;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        List<Integer> numbers = num.chars().mapToObj(c -> (char) c).filter(Character::isDigit).map(String::valueOf)
                .mapToInt(Integer::parseInt).sorted().boxed().collect(Collectors.toList());

        numbers.reversed().forEach(System.out::print);
    }
}
