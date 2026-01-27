package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class StreamEx3 {
    public static void main(String[] args) throws IOException {
        List<Integer> randInt = new Random().ints(1, 100).limit(10).boxed().collect(Collectors.toList());
        IntSummaryStatistics calc = randInt.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.println("개수: " + calc.getCount());
        System.out.println("덧셈: " + calc.getSum());
        System.out.println("최소값: " + calc.getMin());
        System.out.println("최대값: " + calc.getMax());
        System.out.println("평균: " + calc.getAverage());
    }
}
