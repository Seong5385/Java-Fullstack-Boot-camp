package chapter13;

import java.util.Comparator;

public class NameDesc implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		// Member2로 형변환
		Member2 m1 = (Member2)o1;
		Member2 m2 = (Member2)o2;
		
		// 이름으로 내림차순 정렬
		return m1.compareTo(m2) * (-1);
	}

}
