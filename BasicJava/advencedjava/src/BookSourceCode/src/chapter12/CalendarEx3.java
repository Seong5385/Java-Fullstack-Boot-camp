package chapter12;

import java.util.Date;

public class CalendarEx3 {

	public static void main(String[] args) {
		
		
		// 현재일
		int sYear = 2020;
		int sMonth = 6;
		int sDay = 12;
		
		// 이전일
		int eYear = 2020;
		int eMonth = 6;
		int eDay = 1;
		
		Date sd = new Date();
		Date ed = new Date();

		sd.setYear(sYear);
		sd.setMonth(sMonth-1);
		sd.setDate(sDay);
		
		ed.setYear(eYear);
		ed.setMonth(eMonth-1);
		ed.setDate(eDay);
		
		long temp = (sd.getTime() - ed.getTime()) / (1000L*60L*60L*24L);
		int diff = (int)temp;
		
		System.out.println(diff + "일 경과");

	}

}
