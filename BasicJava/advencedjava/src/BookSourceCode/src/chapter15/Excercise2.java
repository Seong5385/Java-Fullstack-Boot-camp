package chapter15;

public class Excercise2 {

	public static void main(String[] args) {
		
		InterfaceLambda il = (int x, int y) -> x+y;
		
		System.out.println(il.sum(1, 2));

	}

}

interface InterfaceLambda {
	public int sum(int x, int y);
}