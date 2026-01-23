package collections.quiz;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Review {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("영화 제목을 일렬로 입력하세요: ");
        String[] movie = br.readLine().split(" ");

        System.out.print("별점은 몇개 입력하시겠습니까?: ");
        int count = Integer.parseInt(br.readLine());

        Map<String, List<Integer>> reviewMap = Arrays.stream(movie).distinct()
                .collect(Collectors.toMap(name -> name,
                        name -> new Random().ints(1, 6).limit(count).boxed().collect(Collectors.toList())));

        reviewMap.entrySet().forEach(value -> {
            System.out.printf("%s의 평균 평점: %.1f\n", value.getKey(),
                    value.getValue().stream().mapToInt(Integer::intValue).average().orElse(0.0));
        });

    }
}
