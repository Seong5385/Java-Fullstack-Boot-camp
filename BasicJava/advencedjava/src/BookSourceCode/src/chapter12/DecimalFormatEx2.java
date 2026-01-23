package chapter12;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		
		System.out.println(df1.format(5500));
		System.out.println(df2.format(5500));

	}

}
