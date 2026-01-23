package chapter13;

public class Rectangle extends Shape {

	// 필드
	int w,h;
	
	// 생성자
	Rectangle() {
		this(1,1);
	}
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	// 메서드 재정의(오버라이딩)
	@Override
	double area() {
		return (w * h);
	}
	
	@Override
	double length() {
		return (w + h) * 2;
	}
	
}
