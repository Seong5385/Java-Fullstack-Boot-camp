package chapter06;

import java.util.Arrays;

public class ReferenceType5 {

	public static void main(String[] args) {
		
		// 배열 변수 생성
		int[] arr1 = {1,2,3};
		
		int[] arr2 = Arrays.copyOf(arr1, 3);
		
		arr2[0] = 4;
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr2[0] : "+arr2[0]);
		
	}

}
