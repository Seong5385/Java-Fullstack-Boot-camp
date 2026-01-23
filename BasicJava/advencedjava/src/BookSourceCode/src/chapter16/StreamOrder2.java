package chapter16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder2 {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("오름차순 정렬");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("내림차순 정렬 1");
		list.stream().sorted((a,b) -> b.compareTo(a) - a.compareTo(b) ).forEach(System.out:: println);
		
		System.out.println("내림차순 정렬 2");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
				
	}
}
