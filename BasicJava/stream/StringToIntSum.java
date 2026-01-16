package stream;

import java.io.*;
import java.util.*;

public class StringToIntSum {
    public static void main(String[] args) throws IOException {
        System.out.print("자료형(int, double, string), 숫자 순서로 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> num = new ArrayList<String>();

        String cName = st.nextToken();

        while (st.hasMoreTokens()) {
            num.add(st.nextToken());
        }

        switch (cName) {
            case "int" -> System.out.println(num.stream().mapToInt(Integer::parseInt).sum());
            case "double" -> System.out.println(num.stream().mapToDouble(Double::parseDouble).sum());
            case "string" ->
                System.out.println(num.stream().filter(s -> s.matches("\\d+")).mapToInt(Integer::parseInt).sum());
            // matches() 정규식 일치 여부 확인 메서드
        }
    }
}