package chapter15;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Runnable run = () -> {
			for (int i=1; i<=10; i++) {
				System.out.println("첫번째:"+i);
			}
		};
		Runnable run2 = () -> {
			for (int i=1; i<=10; i++) {
				System.out.println("두번째:"+i);
			}
		};
		
		Thread t = new Thread(run);
		Thread t2 = new Thread(run2);
		t.start();
		t2.start();
		System.out.println("종료");
	}

}

