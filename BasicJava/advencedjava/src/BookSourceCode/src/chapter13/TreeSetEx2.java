package chapter13;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		
		// 이름순으로 정렬
		TreeSet set = new TreeSet();
		
		set.add(new Member2("홍길동 ",30));
		set.add(new Member2("이순신 ",40));
		set.add(new Member2("김유신 ",50));
		System.out.println(set);
		
		// 나이 오름차순으로 정렬하여 출력 (익명 클래스로 인터페이스 구현)
		TreeSet set2 = new TreeSet(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Member2 m1 = (Member2)o1;
				Member2 m2 = (Member2)o2;
				return m1.age - m2.age;
			}
		});
		
		set2.add(new Member2("홍길동 ",30));
		set2.add(new Member2("이순신 ",40));
		set2.add(new Member2("김유신 ",50));
		System.out.println(set2);
		
		// 이름의 내림차순으로 정렬하여 출력
		TreeSet set3 = new TreeSet(new NameDesc());
		set3.add(new Member2("홍길동 ",30));
		set3.add(new Member2("이순신 ",40));
		set3.add(new Member2("김유신 ",50));
		System.out.println(set3);
		
		// 나이의 내림차순으로 정렬하여 출력
		TreeSet set4 = new TreeSet(new AgeDesc());
		set4.add(new Member2("홍길동 ",30));
		set4.add(new Member2("이순신 ",40));
		set4.add(new Member2("김유신 ",50));
		System.out.println(set4);

	}

}
