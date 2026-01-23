package chapter07;

public class ParamEx2 {

	public static void main(String[] args) {
		
		Param p = new Param();
		//p.add(10.5,5.5); 에러
		
		p.add((int)10.5, (int)5.5);

	}

}

