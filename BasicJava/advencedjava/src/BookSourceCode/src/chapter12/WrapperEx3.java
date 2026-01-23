package chapter12;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		String number = "100";
		
		int i1 = Integer.parseInt(number);
		int i2 = new Integer(number).intValue();
		int i3 = Integer.valueOf(number);
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);

	}

}
