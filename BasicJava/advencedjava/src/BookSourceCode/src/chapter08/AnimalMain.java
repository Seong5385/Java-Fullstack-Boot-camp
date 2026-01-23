package chapter08;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[4];
		
		Animal eagle = new Eagle("조류", "독수리");
		Animal tiger = new Tiger("포유류", "호랑이");
		Animal lion = new Lion("포유류", "사자");
		Animal shark = new Shark("어류", "상어");
		
		ani[0] = eagle;
		ani[1] = tiger;
		ani[2] = lion;
		ani[3] = shark;
		
		for (int i=0; i<ani.length; i++) {
			ani[i].sleep();
		}
	}
}
