package chapter16;

import java.util.Arrays;
import java.util.stream.Stream;

public class Excercise2 {

	public static void main(String[] args) {
		
		// 문자열 배열
		String[] arr = new String[]{"a", "b", "c", "d", "e", "f"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
		
	}

}
