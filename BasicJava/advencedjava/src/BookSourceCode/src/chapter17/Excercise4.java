package chapter17;

public class Excercise4 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			System.out.println("t1 스레드 시작");
			for (int i=0; i<50; i++) {
				System.out.println("t1 : "+i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("t2 스레드 시작");
			for (int i=0; i<50; i++) {
				System.out.println("t2 : "+i);
			}
		});
		
		// 우선순위 지정
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();

	}

}
