package chapter07;

public class MethodOrder {

	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		
		me.one(); // 메서드 실행

	}

}

class MethodEx {
	
	void one() { // 1.
		two();
		System.out.println("one");
	}
	
	void two() { // 2.
		three();
		System.out.println("two");
	}
	
	void three() { // 3.
		System.out.println("three");
	}
}