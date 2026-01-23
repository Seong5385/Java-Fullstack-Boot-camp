package chapter12;

public class WrapperEx4 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer)i; 
		// Integer intg = Integer.valueOf(i);
		
		Long lng = 10L; // Long lng = new Long (100L);
		int i2 = intg + 10; // 참조형과 기본형간의 연산 가능
		long l = intg + lng ; // 참조형 간의 덧셈 가능
		System.out.println("i2 = "+i2);
		System.out.println("l = "+l);
		
		Integer intg2 = new Integer(30);
		int i3 = (int) intg2; // 참조형을 기본형으로 형변환 (형변환 생략가능)
		System.out.println ("i3 : "+i3);

	}

}
