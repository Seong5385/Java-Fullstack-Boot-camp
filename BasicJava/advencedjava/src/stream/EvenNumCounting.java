package stream;

import java.util.Random;

public class EvenNumCounting {
    public static void main(String[] args) {
        long count = new Random().ints(1, 100).limit(100).filter(n -> n % 2 == 0).count();
        System.out.println(count);
    }
}
