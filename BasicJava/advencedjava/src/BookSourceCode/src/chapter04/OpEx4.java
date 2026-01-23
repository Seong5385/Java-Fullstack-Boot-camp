package chapter04;

public class OpEx4 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		System.out.println(a > b);	// true
		System.out.println(a >= b);	// true
		System.out.println(a < b);	// false
		System.out.println(a <= b);	// false
		System.out.println(a == b);	// false
		System.out.println(a != b);	// true
		
		boolean c = a == b; // c 변수에 결과값 대입
		System.out.println("c = "+c);
		boolean d = c == false; // d 변수에 결과값 대입
		System.out.println("d = "+d);
	}

}
