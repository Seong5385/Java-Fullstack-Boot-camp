package chapter07;

public class CarMain2 {

	public static void main(String[] args) {
		
		// Car 타입의 배열객체 생성
		Car[] cars = new Car[3];
		
		// 모든 인덱스에 new 연산자로 객체 생성 후 저장
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car();
			cars[i].color = "화이트";
			cars[i].company = "대우";
			cars[i].type = "경차";
		}
		
		System.out.println("0번 인덱스 color : "+cars[0].color);
		System.out.println("1번 인덱스 color : "+cars[1].color);
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
		cars[0].color = "블랙"; // 0번 인덱스 객체의 color 필드에 "블랙" 대입
		
		System.out.println("0번 인덱스 color : "+cars[0].color);
		System.out.println("1번 인덱스 color : "+cars[1].color);
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
	}
}
