package chapter08;

public class Shark extends Animal {

	Shark(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"은(는) 물속에서 잠을 잔다.");
	}

	
}
