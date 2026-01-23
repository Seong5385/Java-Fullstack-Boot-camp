package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class CClass extends Aclass {

	CClass() {
		this.varA = "varA"; // 사용 가능
		//this.varA2 = "varA2"; // 사용 불가
		this.methodA(); // 사용 가능
		//this.methodA2(); // 사용 불가
	}
}
