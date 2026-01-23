package chapter16;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		
		// 문자열 배열객체 생성
		String[] arr = new String[]{"a", "b", "c", "d", "e", "f"};
		
		// 배열전체 Stream 객체로 변환
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// 인덱스 지정해서 변환 (2부터 5전까지)
		// 두번째 인덱스는 포함되지 않음
		Stream<String> stream2 = Arrays.stream(arr, 2, 5); 
		stream2.forEach(s -> System.out.print(s+" "));

	}

}
