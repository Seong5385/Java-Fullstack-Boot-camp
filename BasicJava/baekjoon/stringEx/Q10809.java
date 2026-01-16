package baekjoon.stringEx;

import java.util.stream.IntStream;
import java.io.*;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        IntStream.rangeClosed('a', 'z')
                .map(c -> str.indexOf(c))
                .forEach(i -> System.out.print(i + " "));
    }
}
