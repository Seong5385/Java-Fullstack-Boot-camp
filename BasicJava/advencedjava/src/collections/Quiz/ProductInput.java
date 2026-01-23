package collections.quiz;

import java.util.*;
import java.io.*;

public class ProductInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> fluteProductMap = new HashMap<>();

        while (true) {
            System.out.print("과일을 입력하세요(나갈거면 q 누르셈): ");
            String product = br.readLine();

            if (product.equals("q"))
                break;

            System.out.print("개수를 입력하세요: ");
            int figure = Integer.parseInt(br.readLine());

            System.out.println("=".repeat(50));

            if (!fluteProductMap.containsKey(product)) {
                fluteProductMap.put(product, figure);
            }

            else if (fluteProductMap.containsKey(product)) {
                fluteProductMap.put(product, fluteProductMap.get(product) + figure);
            }
        }
        System.out.println("=".repeat(50));
        fluteProductMap.entrySet().forEach(e -> System.out.println(e.getKey() + "의 갯수" + ": " + e.getValue()));

    }
}
