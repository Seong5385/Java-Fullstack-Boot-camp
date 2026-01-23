package chapter03;

public class CastingEx2 {

	public static void main(String[] args) {
		
		// 강제형변환 예시
		double pi = 3.14;	// double 자료형
		
		int pi2 = (int)pi;	// 강제형변환
		
		System.out.println(pi2); // 값의 손실 발생
	}
}
