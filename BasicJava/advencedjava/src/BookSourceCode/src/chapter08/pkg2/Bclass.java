package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class Bclass {
	
	public void methodB() {
		Aclass ac = new Aclass();
		//ac.varA = "varA"; // 사용 불가
		//ac.varA2 = "varA2"; // 사용 불가
		//ac.methodA(); // 사용 불가
		//ac.methodA2(); // 사용 불가
	}
	
}
