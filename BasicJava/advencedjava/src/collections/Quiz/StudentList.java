package collections.quiz;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class StudentList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> stuList = Arrays.stream(br.readLine().split(" ")).distinct().collect(Collectors.toList());
        System.out.println("\n출석 현황");
        stuList.forEach(System.out::println);
        System.out.println();

        System.out.print("이름을 입력하세요: ");
        String inputName = br.readLine();

        if (!stuList.stream().anyMatch(name -> name.equals(inputName)))
            System.out.println(inputName + "은(는) 결석입니다.");
        else
            System.out.println(inputName + "은(는) 출석입니다.");
    }
}
