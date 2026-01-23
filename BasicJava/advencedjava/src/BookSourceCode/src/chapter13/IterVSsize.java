package chapter13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IterVSsize {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		for (int i=0; i<100000000; i++) {
			list.add(i);
		}
		
		// Iterator 실행 시간
		long start = System.currentTimeMillis();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			it.next();
		}
		long end = System.currentTimeMillis();
		System.out.println("Iterator 소요 시간 : "+(end-start));
		
		// size 실행 시간
		start = System.currentTimeMillis();
		for (int i=0; i<list.size(); i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("size() 소요 시간 : "+(end-start));
	}

}
