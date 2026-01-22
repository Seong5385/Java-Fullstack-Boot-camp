import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());

        System.out.println(sumNum(numbers));

    }

    public static int sumNum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
