package chapter09;

interface Player {
	
	// 추상 메서드
	void play();
}

public class Excercise3 {

	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);

	}
	
	public static void playGame(Player p) {
		p.play();
	}

}


class BaseBallPlayer implements Player {
	public void play() {
		System.out.println("야구선수가 야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	public void play() {
		System.out.println("축구선수가 축구를 합니다.");
	}
}