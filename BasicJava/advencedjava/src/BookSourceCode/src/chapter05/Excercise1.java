package chapter05;

public class Excercise1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// for문을 이용하여 반복 합계 연산
		// 1부터 100까지 반복하면서 5의 배수만 합산
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) sum += i;
		}
		System.out.println("5의 배수의 합계는 "+sum);
		
		// 5부터 5씩 증가
		sum = 0;
		for (int i=5; i<=100; i+=5) {
			sum += i;
		}
		System.out.println("5의 배수의 합계는 "+sum);
		
	}
}
