package chapter04;

public class Excercise4 {

	public static void main(String[] args) {
		
		int age = 6;
		int height = 130;
		boolean parent = false;
		boolean heartDease = true;
		
		boolean take = ((age >= 6 && height >= 120) || (height >= 120 && parent == true)) && heartDease == false;
		
		System.out.println(take);
	}
}
