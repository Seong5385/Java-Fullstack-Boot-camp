package chapter07;

public class FinalEx {

	public static void main(String[] args) {
		
		Final f = new Final();
		//f.number = 200; // 에러	
	}
	
}

class Final {
	final int number;
	
	Final() {
		number = 100;
	}
}