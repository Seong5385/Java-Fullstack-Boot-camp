package chapter13;

abstract class Shape {
	
	// 필드
	int x, y;
	
	// 생성자
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상메서드
	abstract double area();
	abstract double length();
	
	// 일반 메서드
	public String getLocation() {
		return "x:" + x + ",y:" + y;
	}
	
}
