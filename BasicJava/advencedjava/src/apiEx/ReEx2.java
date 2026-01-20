package apiEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx2 {
    public static void main(String[] args) {

        // "0|1-9|*" 부분을 "0|[1-9]|\\*"로 수정했습니다.
        String[] patterns = { ".", "[a-z]?", "[0-9]+", "0|[1-9]|\\*", "^[0-9]", "[^0-9]", "[a-z]*", "[a-z]+", "02|010",
                "\\s", "\\S", "\\d", "\\w", "\\W" };
        String[] datas = { "bat", "021231234", "12345", "011", "bed", "02", "A", "9", "a", "*" };

        for (String d : datas) {
            System.out.print(d + " 문자와 일치하는 패턴 : ");
            for (String p : patterns) {
                try {
                    Pattern pattern = Pattern.compile(p);
                    Matcher m = pattern.matcher(d);
                    // matches()는 문자열 전체가 패턴과 일치해야 true를 반환합니다.
                    if (m.matches()) {
                        System.out.print(p + ", ");
                    }
                } catch (Exception e) {
                    System.out.print("[에러 패턴: " + p + "]");
                }
            }
            System.out.println();
        }
    }
}
