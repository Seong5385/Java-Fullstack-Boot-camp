package array.quiz;

import java.util.stream.IntStream;

public class Quiz1 {
    public static void main(String[] args) {
        int[] arr1 = IntStream.range(1, 201).filter(n -> n % 10 == 0).toArray();
        String str = "Hello";
        char[] arr2 = str.toCharArray();

        System.out.print("{");
        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1)
                System.out.print(arr1[i] + ", ");
            else
                System.out.println(arr1[i] + "}");
        }

        System.out.print("{");
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length - 1)
                System.out.print(arr2[i] + ", ");
            else
                System.out.println(arr2[i] + "}");
        }

    }
}
