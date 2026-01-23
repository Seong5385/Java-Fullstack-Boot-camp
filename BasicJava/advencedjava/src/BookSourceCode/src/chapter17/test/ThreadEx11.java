package chapter17.test;

public class ThreadEx11 {

	public static void main(String[] args) {
		
		// 게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		// 플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
		
	}

}

// 스마트폰게임 클래스
class SmartPhoneGame {
	private int level; // 레벨
	
	public int getLevel() {
		return this.level;
	}
	
	
//	public synchronized void increaseLevel() {
//		while (true) {
//			this.level++; // 레벨 1씩 증가
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {}
//			// 현재 스레드의 이름과 레벌 출력
//			System.out.println(Thread.currentThread().getName()+" Level : " + this.level);
//			
//			// 레벨이 10의 배수가 되면 종료
//			if (this.level % 10 == 0) break;
//		}
//	}
	
	public void increaseLevel() {
		synchronized (this) {
			while (true) {
				this.level++; // 레벨 1씩 증가
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				// 현재 스레드의 이름과 레벌 출력
				System.out.println(Thread.currentThread().getName()+" Level : " + this.level);
				
				// 레벨이 10의 배수가 되면 종료
				if (this.level % 10 == 0) break;
			}
		}
	}
	
}

// 플레이어1 스레드
class Player1 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}

// 플레이어2 스레드
class Player2 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}
