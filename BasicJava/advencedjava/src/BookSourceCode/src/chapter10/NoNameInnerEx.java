package chapter10;


class Outer {
	class InstanceInner { // 인스턴스 내부클래스
		int ii_var = 100;
		//static int cv = 10; // static 사용 불가
		final static int II_VAR = 200;
	}
	static class StaticInner { //static 내부 클래스
		int si_var = 300;
		static int cv = 400;
		final static int SI_VAR = 500;
	}
	void method() {
		class LocalInner { // 로컬 내부 클래스
			int li_var = 600;
			//static int cv = 700; // static 사용 불가
			final static int LI_VAR = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.li_var);
		System.out.println(lc.LI_VAR);
	}
	void method2() {
		// Outer 클래스의 메서드
		
		// 로컬 내부 클래스 접근 불가
		//LocalInner li = new LocalInner();
	}
		
}
public class NoNameInnerEx {
	public static void main(String[] args) {
		
		Outer.StaticInner si = new Outer.StaticInner(); // static 내부 클래스 객체 생성
		System.out.println(si.si_var);
		System.out.println(Outer.StaticInner.cv);
		System.out.println(Outer.StaticInner.SI_VAR);
		
		Outer.InstanceInner ii = new Outer().new InstanceInner(); // 인스턴스 내부 클래스 객체 생성
		
		Outer outer = new Outer();
		Outer.InstanceInner ii2=outer.new InstanceInner(); // 인스턴스 내부 클래스 객체 생성
		
		// 인스턴스 내부 클래스
		System.out.println(ii2.ii_var);
		System.out.println(Outer.InstanceInner.II_VAR);
		
		
		outer.method();
	}
}
