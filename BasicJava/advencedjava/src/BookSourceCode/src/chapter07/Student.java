package chapter07;

public class Student {

	// 필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
	
	// 1번 생성자
	Student() {
		
	}
	
	// 2번 생성자
	Student(String n) {
		name = n;
	}
	
	// 3번 생성자
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4번 생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;		
	}
	
	// 학과와 학년을 매개변수로 받는 생성자 (에러 발생)
//	Student(String d, int g) {
//		department = d;		
//		grade = g;
//	}
}
