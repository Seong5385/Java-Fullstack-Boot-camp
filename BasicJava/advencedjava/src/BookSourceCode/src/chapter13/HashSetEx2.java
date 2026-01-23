package chapter13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		// HashSet 객체 생성
		Set set = new HashSet();
		
		// 문자열 객체 두개 추가
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		// Member 객체 두개 추가(사용자 정의 클래스)
		set.add(new Member("홍길동 ", 40));
		set.add(new Member("고길동 ", 40));
		
		// 출력
		System.out.println(set);

	}

}
