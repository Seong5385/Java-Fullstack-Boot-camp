package chapter09;

public interface MyInterface1 {

	default void defaultMethod() {
		System.out.println("MyInterface1 의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드");
	}
}
