package chapter07;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student(); // 1번 생성자
		Student stu2 = new Student("홍길동"); // 2번 생성자
		Student stu3 = new Student("홍길동", 4); // 3번 생성자
		Student stu4 = new Student("홍길동", 4, "소프트웨어공학");
		
	}
}
