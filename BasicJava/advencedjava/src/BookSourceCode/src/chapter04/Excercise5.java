package chapter04;

public class Excercise5 {

	public static void main(String[] args) {
		
		int year = 2020;
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// 윤년이면 true, 윤년이 아니면 false
		System.out.println(leapYear);
		
		
	}
}
