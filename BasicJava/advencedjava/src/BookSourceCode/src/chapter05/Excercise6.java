package chapter05;

public class Excercise6 {

	public static void main(String[] args) {
		
		// 줄 반복
		for (int i=1; i<=5; i++) {
			// 공백출력
			for (int j=5-i; j>0; j--) {
				System.out.print(" ");
			}
			// 별출력
			for (int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println("");
		}
		
	}
}
