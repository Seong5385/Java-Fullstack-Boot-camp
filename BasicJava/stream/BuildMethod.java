package stream;

import java.io.*;
import java.util.stream.*;

public class BuildMethod {
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Stream.generate(() -> "애국가").limit(10);

        stream.toList().forEach(s -> System.out.println(s));
    }
}
