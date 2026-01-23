package chapter07;

public class Excercise9 {
	
	public static void main(String[] args) {
		
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex1 == ex2 : "+ (ex1 == ex2));
		
	}
	
}

class Excercise {
	
	// 코드 작성
	private static Excercise instance = new Excercise();
	
	public static Excercise getInstance() {
		return instance;
	}
	
	public Excercise() {
		System.out.println("객체 생성");
	}
}
