package chapter16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMatch {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		list.parallelStream().mapToDouble(a -> a.area()).peek(a -> System.out.println(a)).sum();
		
				
	}
}
