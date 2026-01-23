package chapter12;

public class WrapperEx {

	public static void main(String[] args) {
		
		// 정수 10이 Integer 클래스 객체로 변환 (boxing)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println("i1==i2 : " + (i1==i2));
		System.out.println("i1.equals(i2) : " + (i1.equals(i2)));
		System.out.println("i1.toString() : " + i1.toString());
		
		//i1 객체가 100 정수로 변환 (unboxing)
		System.out.println("i1==10 : " + (i1==10));
		int i3 = 10;
		System.out.println("i1==i3 : " + (i1==i3));

	}

}
