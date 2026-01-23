package chapter15;

import java.util.function.Predicate;

public class LambdaEx10 {
	
	// 앞 예제에서 작성한 Student 클래스의 배열
	static Student[] list = { 
			new Student("홍길동", 90, 80, "컴공"), 
			new Student("이순신", 95, 70, "통계 "),
			new Student("김유신", 100, 60, "컴공")
	};
	

	public static void main(String[] args) {
		
		// 과가 컴공인 학생의 영어점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수 : "+avg);
		
		// 과가 컴공인 학생의 수학점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학점수 : "+avg2);
		
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals 비교
			if (predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals() 비교
			if (predicate.test(student)) {
				count++;
				sum += student.getMath();
			}
		}
		return (double)sum/count;
	}
	
}

