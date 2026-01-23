package collections.quiz;

import java.util.*;
import java.io.*;

public class Category {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> cate = new HashMap<>();
        List<String> elect = new ArrayList<>(List.of("냉장고", "세탁기"));
        List<String> cloth = new ArrayList<>(List.of("티셔츠"));
        int count = 0;

        cate.put("elect", elect);
        cate.put("cloth", cloth);

        while (count < 2) {

            String category = br.readLine().trim();

            if (category.equals("elect")) {
                cate.get(category).add(br.readLine());
            }

            else if (category.equals("cloth")) {
                cate.get(category).add(br.readLine());
            }

            else if (category.equals("q"))
                break;

            else {
                System.out.println("해당 카테고리가 없습니다 다시 입력하세요.");
            }

        }

        cate.forEach((k, v) -> System.out.println(k + ", " + v));
    }
}
