package chapter13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		for(int i=1; i<= 5;i++) {
			v.add(i);
		}
		
		// Enumeration 으로 출력
		Enumeration e = v.elements();
		System.out.println("Enumeration 출력");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// Iterator로 출력
		Iterator it = v.iterator();
		System.out.println("Iterator 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
