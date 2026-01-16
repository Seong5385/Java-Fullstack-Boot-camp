package array;

import java.util.stream.IntStream;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr1 = IntStream.range(10, 60).filter(n -> n % 10 == 0).toArray();
        int[] arr2 = IntStream.range(1, 11).toArray();
        int[] arrInt = { 40, 20, 30, 40, 50 };

        String[] arr3 = {
                "이순신",
                "강감찬",
                "홍길동",
                "이성계"
        };

        for (int i : arr1)
            System.out.print(i + " ");

        System.out.println("\n");

        System.out.print("{");
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length - 1)
                System.out.print(arr2[i] + ", ");
            else
                System.out.println(arr2[i] + "}");
        }

        System.arraycopy(arrInt, 1, arr2, 3, 4);

        System.out.print("{");
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length - 1)
                System.out.print(arr2[i] + ", ");
            else
                System.out.println(arr2[i] + "}");
        }

        for (String s : arr3)
            System.out.println(s);

    }
}
