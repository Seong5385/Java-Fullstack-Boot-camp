package chapter17;

public class ThreadEx6 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i=1;
				while (true) {
					System.out.println("t1:"+i);
					i++;
					if (Thread.interrupted()) {
						break;
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		t1.interrupt();

	}

}

