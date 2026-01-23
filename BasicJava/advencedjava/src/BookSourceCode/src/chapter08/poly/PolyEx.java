package chapter08.poly;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run();
		
		// 부모클래스의 자료형으로 선언 (자동형변환)
		Parent p = new Child();
		p.run(); // 재정이된 메서드가 실행
		// p.eat(); // 에러
		

	}

}
