package chapter07;

public class ParamEx {

	public static void main(String[] args) {
		
		Param p = new Param();
		p.add(10,5);
		//p.add("10", "5"); //에러
		
		p.add2(10, 5);

	}

}

class Param {
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
}