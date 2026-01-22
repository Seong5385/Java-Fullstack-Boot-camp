package collections.quiz;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class WordCollector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문장 입력");
        List<String> words = Arrays.stream(br.readLine().split(" "))
                .map(s -> s.toLowerCase().replace(",", " ").replace(".", " "))
                .collect(Collectors.toList());

        System.out.print("단어 검색: ");
        String word = br.readLine();
        words.stream().filter(w -> w.equals(word)).distinct().forEach(x -> System.out.printf("%s 가 존재합니다", x));

        if (words.contains(word) == false) {
            System.out.println("단어가 존재하지 않습니다.");
        }
    }
}
