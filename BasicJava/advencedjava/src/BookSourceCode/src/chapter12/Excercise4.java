package chapter12;

public class Excercise4 {

	public static void main(String[] args) {
		
		// 아이디,이름,나이
		String[] member = {
				"hong,홍길동,30",
				"lee,이순신,40",
				"kim,김유신,50"
		};
		
		// 이름만 출력
		for (int i=0; i<member.length; i++) {
			System.out.println(member[i].split(",")[1]);
		}
		
		// 평균 나이 출력
		int ageSum = 0;
		for (int i=0; i<member.length; i++) {
			ageSum += Integer.parseInt(member[i].split(",")[2]);
		}
		System.out.println("평균나이 : "+(double)ageSum/member.length);

	}

}
