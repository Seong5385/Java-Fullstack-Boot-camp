package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class StreamEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.stream(br.readLine().split(",")).map(String::valueOf)
                .collect(Collectors.joining(",", "[", "]")));
    }
}
