package chapter07;

public class ReturnEx2 {
	
	public static void main(String[] args) {
		
		Return2 obj = new Return2();
		
		obj.getTest(0);
		obj.getTest(1);
		
		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
		
	}

}


class Return2 {
	
	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");
		
		if (type == 1) {
			return;
		}
		
		System.out.println("getTest() 메서드 끝");
	}
	
	String getName(int type) {
		
		if (type == 1) {
			return "";
		}
		
		return "홍길동";
	}
	
	String getAge(int type) {
		
		return "";
		
		//return "홍길동"; // 에러발생
	}
}