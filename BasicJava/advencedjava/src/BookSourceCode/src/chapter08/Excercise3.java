package chapter08;

public class Excercise3 {

	public static void main(String[] args) {
		
		
	}

}

class Character {
	int hp;
	int power;
	
	public void attack (Object target) {
		System.out.println("공격");
	}
}

class Warrior extends Character {
	
	int weapon;
	
	public void defence(Object target) {
		System.out.println("방어");
	}
}

class Gladiator extends Character {

	int shield;
	
	public void powerAttack(Object target) {
		System.out.println("파워공격");
	}
}

class Wizard extends Character {

	int heal;
	
	public void healing(Object target) {
		System.out.println("치료마법");
	}
}