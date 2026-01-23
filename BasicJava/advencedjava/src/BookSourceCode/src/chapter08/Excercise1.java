package chapter08;

public class Excercise1 {

	public static void main(String[] args) {
		
		ChildEx ce = new ChildEx();
		ParentEx pe = new ParentEx();
		

	}

}

class ParentEx {
	ParentEx() {
		this(1);
		System.out.println("(1)");
	}
	ParentEx(int x) {
		System.out.println("(2)");
	}
}

class ChildEx extends ParentEx {
	ChildEx() {
		this(1);
		System.out.println("(3)");
	}
	ChildEx(int x) {
		System.out.println("(4)");
	}
}