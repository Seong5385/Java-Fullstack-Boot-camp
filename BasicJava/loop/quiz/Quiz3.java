package loop.quiz;

import java.util.stream.IntStream;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("5의 배수의 합: " + IntStream.range(1, 101).filter(num -> num % 5 == 0).sum());
    }
}
