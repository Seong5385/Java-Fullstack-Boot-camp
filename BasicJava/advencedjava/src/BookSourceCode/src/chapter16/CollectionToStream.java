package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {

	public static void main(String[] args) {
		
		// 문자열 배열을 컬렉션프레임워크 List로 변환
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		// List 객체를 stream()메서드를 이용해 Stream 객체로 생성
		Stream<String> stream = list.stream();
		// 내부반복자를 이용해 출력
		stream.forEach(s -> System.out.println(s));
				
	}
}
