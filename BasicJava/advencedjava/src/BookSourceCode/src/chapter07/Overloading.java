package chapter07;

public class Overloading {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		
		System.out.println(op.multiply(4, 3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));

	}

}

class Operator {
	
	int multiply(int x, int y) {
		System.out.println("(int, int)");
		return x * y;
	}
	
	double multiply(double x, double y) {
		System.out.println("(double, double)");
		return x * y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int, double)");
		return x * y;
	}
	
	double multiply(double x, int y) {
		System.out.println("(double, int)");
		return x * y;
	}
}