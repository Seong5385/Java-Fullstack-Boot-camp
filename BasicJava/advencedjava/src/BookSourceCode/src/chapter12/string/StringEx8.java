package chapter12.string;

public class StringEx8 {
	
	public static void main(String[] args) {
		
		String[] str = {"1", "2", "3", "4"};
		
		int sum1 = 0;
		for (int i=0; i<str.length; i++) {
			sum1 += Integer.parseInt(str[i]);
		}
		System.out.println("sum1 = "+sum1);
		
		long sum2 = 0;
		for (int i=0; i<str.length; i++) {
			sum2 += Long.parseLong(str[i]);
		}
		System.out.println("sum2 = "+sum2);
		
		double sum3 = 0;
		for (int i=0; i<str.length; i++) {
			sum3 += Double.parseDouble(str[i]);
		}
		System.out.println("sum3 = "+sum3);

	}

}
