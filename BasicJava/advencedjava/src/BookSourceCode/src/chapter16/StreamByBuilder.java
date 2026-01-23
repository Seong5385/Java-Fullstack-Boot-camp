package chapter16;

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		
		// generate() 메서드로 Stream 객체 생성
		// 리미트 10개 생성
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10);
		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s));

	}

}
