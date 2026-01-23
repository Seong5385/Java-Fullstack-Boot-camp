package chapter05;

public class neverLoop {

	public static void main(String[] args) {
		
		for (;;) {
			System.out.println(1);
			if (1 > 0) {
				break;
			}
		}
		
		while (true) {
			System.out.println(1);
		}

	}

}
