package chapter16;

import java.util.Arrays;

public class StreamOther {

	public static void main(String[] args) {
		
		int intArr[] = {10,20,30,40,50,60};
		
		// double타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();
		
		// int타입의 요소를 갖는 Stream<Integer>으로 형변환
		Arrays.stream(intArr).boxed().forEach(i -> System.out.println(i.getClass()));

	}

}
