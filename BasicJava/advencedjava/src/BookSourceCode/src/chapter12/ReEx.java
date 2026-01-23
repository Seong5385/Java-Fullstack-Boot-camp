package chapter12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {

	public static void main(String[] args) {
		
		// 소문자 b로 시작하는  알파벳 소문자 0개 이상 규칙
		Pattern p = Pattern.compile("b[a-z]*");
		Matcher m;
		
		// 문자열 bat 확인
		m = p.matcher("bat");
		System.out.println("bat = "+m.matches());
		
		// 문자열 cat 확인
		m = p.matcher("cat");
		System.out.println("cat = "+m.matches());
		
		// 문자열 bed 확인
		m = p.matcher("bed");
		System.out.println("bed = "+m.matches());

	}

}
