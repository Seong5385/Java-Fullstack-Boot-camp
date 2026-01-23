package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptionalNoElem2 {

	public static void main(String[] args) {
		
		// 요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list = new ArrayList<Integer>();
		
		long count =list.stream().count();
		System.out.println("요소들의 갯수 : " + count);
		
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		// 요소가 존재하는 경우에만 평균 출력
		if(avg.isPresent()) {
			System.out.println("요소들의 평균 : " + avg.getAsDouble());
		}
		
		// 요소값이 없는 경우 기본값 설정
		int max =list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : " + max);
		
		// 요소값이 없는 경우 기본값 설정
		int min =list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최소 값 : " + min);
		
		// 요소가 존재하면 실행
		list.stream().mapToInt(Integer::intValue)
				            .findFirst().ifPresent(a -> System.out.println("요소 중 첫번째 값: "+a));
		
		

	}

}
