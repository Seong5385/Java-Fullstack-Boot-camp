package chapter10;

public class LocalInnerEx { // 바깥클래스
	int i=10;

	void outerMethod(){
		class Inner { // 로컬 클래스
			int x=20; // 메서드 지연변수
			int i=30; // 메서드 지역변수
			void innerMethod() {
				System.out.println(x);
				System.out.println(i); // 안쪽 클래스의 i변수
				System.out.println(this.i); // 안쪽 클래스의 i변수
				System.out.println(LocalInnerEx.this.i); // 바깥 클래스의 i변수
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}
	
}
