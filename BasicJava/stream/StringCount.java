package stream;

import java.io.*;
import java.util.*;

public class StringCount {
    public static void main(String[] args) throws IOException {
        System.out.print("문자열을 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Collections.list(st).stream().map(token -> (String) token).mapToInt(String::length)
                .forEach(x -> System.out.println(x));
    }
}
