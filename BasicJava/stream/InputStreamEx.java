package stream;

import java.io.*;
import java.util.stream.IntStream;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        String str = "baekjoon";
        IntStream.rangeClosed('a', 'z').map(c -> str.indexOf(c)).forEach(System.out::println);
    }
}
