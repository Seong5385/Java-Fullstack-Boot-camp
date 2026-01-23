package chapter07;

public class ReturnEx {
	
	public static void main(String[] args) {
		
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}


class Return {
	
	String getName() {
		return "홍길동";
	}
	
	int getAge() {
		return 30;
	}
}