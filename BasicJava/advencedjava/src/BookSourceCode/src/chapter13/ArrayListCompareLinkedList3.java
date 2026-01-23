package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList3 {

	public static void main(String[] args) {

		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		System.out.println("ArrayList 추가");
		long start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			alist.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("LinkedList 추가");
		start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			llist.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
