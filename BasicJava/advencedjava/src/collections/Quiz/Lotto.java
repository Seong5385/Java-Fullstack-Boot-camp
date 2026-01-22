package collections.quiz;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        new Random().ints(1, 46).distinct().limit(6).forEach(x -> System.out.print(x + " "));
    }
}
