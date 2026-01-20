package apiEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx1 {

    public static void main(String[] args) {

        // 1. Pattern 클래스의 static 메서드 compile에 정규표현식을 매개변수로 넣고 객체 생성
        // 소문자 b로 시작하는 알파벳 소문자 0개 이상 규칙
        Pattern p = Pattern.compile("b[a-z]*");
        // 2. Matcher 클래스를 이용해서 생성한 패턴 객체의 matcher() 메서드의 매개변수로 비교할 대상 문자열을 넣어 Matcher
        // 객체 생성
        Matcher m;

        // 3. Matcher 객체 matches() 매서드를 호출해 매칭 여부를 확인.
        // 문자열 bat 확인
        m = p.matcher("bat");
        System.out.println("bat = " + m.matches());

        // 문자열 cat 확인
        m = p.matcher("cat");
        System.out.println("cat = " + m.matches());

        // 문자열 bed 확인
        m = p.matcher("bed");
        System.out.println("bed = " + m.matches());

    }

}
