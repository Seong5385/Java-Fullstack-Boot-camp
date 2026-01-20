package collections.set;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class SetEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> num = new Random().ints(1, 46).limit(7).boxed().collect(Collectors.toSet());
        num.forEach(System.out::println);

        Set<Character> chars = br.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        chars.forEach(System.out::println);
    }
}
