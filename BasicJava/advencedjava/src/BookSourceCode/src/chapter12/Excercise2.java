package chapter12;

class Car {
	String name;
	String company;
	
	// 코드 작성
	public String toString() {
		return company + ":" + name;
	}
}

public class Excercise2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.name = "그랜져";
		car.company = "현대자동차";
		
		System.out.println(car);

	}

}
