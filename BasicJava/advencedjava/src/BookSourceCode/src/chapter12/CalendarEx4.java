package chapter12;

import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		
		
		// 현재일
		int sYear = 2020;
		int sMonth = 6;
		int sDay = 12;
		
		// 이전일
		int eYear = 2020;
		int eMonth = 6;
		int eDay = 1;
		
		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
		sCal.set(sYear, sMonth+1, sDay);
		eCal.set(eYear, eMonth+1, eDay);
		
		long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis()) / 1000;
		
		long diffDay = diffSec / (24*60*60);
		
		System.out.println(diffDay + "일 경과");

	}

}
