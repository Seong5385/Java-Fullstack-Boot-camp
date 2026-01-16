package stream;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class IntStreamEx {
    public static void main(String[] args) throws IOException {
        List<Integer> in = IntStream.range(1, 10).boxed().collect(Collectors.toList()); // boxed() 객체 변환하게 도와주는 메서드
        List<Double> dou = new Random().doubles(3).boxed().collect(Collectors.toList());

        in.forEach(x -> System.out.println(x));
        dou.forEach(x -> System.out.println(x));
    }
}
