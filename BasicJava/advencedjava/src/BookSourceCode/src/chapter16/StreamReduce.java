package chapter16;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		double areaSum = list.stream().mapToDouble(Shape::area).sum();
		System.out.println("sum()를 이용한 면적 합계 :" + areaSum);
		areaSum = list.stream().mapToDouble(Shape::area).reduce((a, b) -> a+b).getAsDouble();
		System.out.println("reduce(Operator) 를 이용한 면적 합계 :" + areaSum);
		
		areaSum = list.stream().mapToDouble(Shape::area)
				.reduce(0,(a,b) -> a+b);
		System.out.println("reduce(0,Operator) 를 이용한 면적 합계 :" + areaSum);
				
	}
}
