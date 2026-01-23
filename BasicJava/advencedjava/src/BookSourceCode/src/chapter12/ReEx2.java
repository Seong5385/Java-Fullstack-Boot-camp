package chapter12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx2 {

	public static void main(String[] args) {
		
		String[] patterns = {"." ,"[a-z]?","[0-9]+","0[1-9]*","^[0-9]",
				"[^0-9]","[a-z]*","[a-z]+","02|010" ,"\\s", "\\S" ,"\\d" ,"\\w","\\W"};
		String[] datas = {"bat","021231234","12345","011","bed","02","A","9","a","*"};

		for(String d : datas) {
			System.out.print(d+"문자와 일치하는 패턴 : ");
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			System.out.println();
		}
	}

}
