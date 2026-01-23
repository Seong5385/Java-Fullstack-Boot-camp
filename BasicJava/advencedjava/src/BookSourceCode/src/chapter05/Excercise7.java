package chapter05;

public class Excercise7 {

	public static void main(String[] args) {
		
		int count = 0;
		while (true) {
			int dice = (int)(Math.random()*6)+1;
			
			System.out.println("("+dice+")");
			count++;
			
			if (dice == 6) {
				break;
			}
		}
		System.out.println("총 주사위 굴린 횟수는 : "+count+"회");
		
	}
}
