package chapter17;

public class ThreadEx5 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int i=1;
					while (true) {
						System.out.println("t1:"+i);
						// sleep을 넣지 않으면 interrupt되지 않음
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) {
					
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

