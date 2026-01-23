package chapter14;

public class GenericEx {

	public static void main(String[] args) {
		
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"홍길동","이순신","김유신"};
		
		// Object 타입의 매개변수에 String 배열객체 전달
		nogen.set(ss);
		nogen.print();
		
		Object[] objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o; // String으로 강제형변환
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		
		// Object 타입의 매개변수에 Integer 배열객체 전달
		nogen.set(ii);
		objs = nogen.get();
		
		for(Object o : objs) {
			String s = (String)o; // String으로 강제형변환 (에러발생)
			System.out.println(s.trim());
		}

	}

}

class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for(Object o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}