package chapter12.stringbuffer;

public class StringEx9 {
	
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println("str1 = "+System.identityHashCode(str1));
		System.out.println("str2 = "+System.identityHashCode(str2));
		
		// 기본 객체에 + 연산 후 다시 대입
		str1 = str1 + "efg";
		System.out.println("str1 = "+System.identityHashCode(str1));

	}

}
