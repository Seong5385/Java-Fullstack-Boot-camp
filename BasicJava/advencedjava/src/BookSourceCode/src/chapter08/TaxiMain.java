package chapter08;

public class TaxiMain {
	
	public static void main(String[] args) {
		
		Taxi t = new Taxi();
		t.go();
		
		int a = 10;
		double b = a; // 자동형변환

		double c = 10.5;
//		int d = c; // 에러

		//강제형변환
		int d = (int)c;
		
		System.out.println(b);
		System.out.println(d);
		
	}
}
