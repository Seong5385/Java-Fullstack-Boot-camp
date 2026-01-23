package chapter16;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {

		// 문자열 스트림 객체
		Stream<String> stream1 = Stream.of("홍길동", "김유신", "이순신", "유관순");
		// 정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		// concat() 메서드로 두 스트림 객체 
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.print(a + ","));

	}

}
