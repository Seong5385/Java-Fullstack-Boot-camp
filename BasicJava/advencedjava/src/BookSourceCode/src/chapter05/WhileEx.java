package chapter05;

public class WhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : "+sum);

	}

}
