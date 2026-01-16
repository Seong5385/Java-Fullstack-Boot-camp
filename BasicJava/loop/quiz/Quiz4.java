package loop.quiz;

import java.util.stream.IntStream;

public class Quiz4 {
    public static void main(String[] args) {
        System.out.println("홀수의 합: " + IntStream.range(1, 101).filter(num -> num % 2 != 0).sum());
        System.out.println("짝수의 합: " + IntStream.range(1, 101).filter(num -> num % 2 == 0).sum());
    }
}
