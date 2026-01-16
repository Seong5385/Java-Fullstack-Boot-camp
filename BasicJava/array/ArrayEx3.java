package array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[][][] twoDArray = Stream.of(IntStream.range(1, 4).toArray(),
                IntStream.range(1, 4).toArray(), IntStream.range(1, 4).toArray()).toArray(int[][][]::new);

        IntStream.range(0, twoDArray.length).forEach(i -> {
            System.out.printf("[Row %d]: %s%n", i, Arrays.toString(twoDArray));
        });
    }
}
