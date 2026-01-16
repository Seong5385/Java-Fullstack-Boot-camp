package stream;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ArrayEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자형 배열 변환");
        int[] num1 = new Random().ints(1, 46).distinct().limit(7).sorted().toArray();
        for (int n : num1)
            System.out.print(n + " ");

        System.out.println("\n" + "숫자형 리스트 선언");
        List<Integer> intList = new Random().ints(1, 101).distinct().limit(10).sorted().boxed()
                .collect(Collectors.toList());
        intList.forEach(x -> System.out.print(x + " "));

        System.out.println("\n" + "입력된 값을 배열에 저장");
        System.out.print("숫자를 입력하세요: ");
        int[] num2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int n : num2)
            System.out.print(n + " ");

        System.out.println("\n");
        System.out.println("문자열 배열 변환");
        System.out.print("문자열 입력: ");
        String[] str = br.readLine().split(" ");
        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println("\n" + "문자열 리스트 선언");
        List<String> strList = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
        strList.forEach(s -> System.out.printf("%s ", s));

    }
}
