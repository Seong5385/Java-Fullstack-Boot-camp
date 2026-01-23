package chapter15;

public class LambdaEx3 {

	public static void main(String[] args) {
		
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 "+name+"입니다.");
		};
		
		li3.print("홍길동");

	}

}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name);
}