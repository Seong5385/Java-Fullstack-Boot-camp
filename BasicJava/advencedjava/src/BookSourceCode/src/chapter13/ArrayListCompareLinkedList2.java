package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList2 {

	public static void main(String[] args) {

		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		for (int i=0; i<100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList 추가");
		long start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			alist.add(500, "i");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("LinkedList 추가");
		start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			llist.add(500, i+"");
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
