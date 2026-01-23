package chapter13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		
		// Iterator 객체 선언
		Iterator it = null;
		
		// List 객체와 Set 객체 생성
		List list = new ArrayList();
		Set set = new HashSet();
		
		// list와 set에 5개의 값 추가
		for(int i=1; i<=5;i++) {
			list.add(i);
			set.add(i+5);
		}
		
		// 출력
		System.out.println(list);
		System.out.println(set);
		
		// list에서 Iterator 객체로 생성
		it = list.iterator();
		
		// lit의 Iterator 객체 출력
		System.out.println("List Iterator 출력");
		iteratorPrint(it);
		
		// set에서 Iterator 객체로 생성
		it = set.iterator();
		
		// set의 Iterator 객체 출력
		System.out.println("Set Iterator 출력");
		iteratorPrint(it);
		
		// 출력
		System.out.println(list);
		System.out.println(set);

	}
		
	private static void iteratorPrint(Iterator it) {
		// Iterator 객체 반복 (다음 요소가 있으면 반복)
		while(it.hasNext()) {
			// Iterator 객체의 다음 요소 읽어와 출력
			System.out.println(it.next());
			// 현재 요소 삭제
			it.remove();
		}
	}

}
