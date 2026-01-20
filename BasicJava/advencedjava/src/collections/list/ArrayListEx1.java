package collections.list;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ArrayListEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = new Random().ints(1, 46).distinct().limit(7).sorted().boxed().collect(Collectors.toList());
        num.forEach(System.out::println);

        List<String> str = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
        str.forEach(System.out::println);

    }
}
