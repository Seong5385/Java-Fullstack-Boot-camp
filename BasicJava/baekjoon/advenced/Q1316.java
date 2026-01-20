package baekjoon.advenced;

import java.io.*;
import java.util.*;

public class Q1316 {

    private static boolean isGroupWord(String s) {
        Set<Character> seen = new HashSet<>();
        char prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            // 문자가 바뀌는 순간만 체크
            if (cur != prev) {
                if (seen.contains(cur))
                    return false; // 예전에 나온 적 있으면 그룹단어 아님
                seen.add(cur); // 처음 나온 문자면 기록
                prev = cur;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (isGroupWord(s))
                count++;
        }

        System.out.println(count);
    }
}
