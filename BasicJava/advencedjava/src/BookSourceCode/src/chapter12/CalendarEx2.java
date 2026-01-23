package chapter12;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("오전 (0) 오후 (1) :" + today.get(Calendar.AM_PM));
		System.out.println("시간 (0~11) :" + today.get(Calendar.HOUR));
		System.out.println("시간 (0~23) :" + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0~59) :" + today.get(Calendar.MINUTE));
		System.out.println("초 (0~59) :" + today.get(Calendar.SECOND));
		System.out.println("밀리초 (0~999) :" + today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(12~12):" + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
		System.out.println("이번달의 마지막일자 :" + today.getActualMaximum(Calendar.DATE));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, (6-1), 12);
		System.out.println("날짜 :" + 
						cal.get(Calendar.YEAR) + "년 " + 
						(cal.get(Calendar.MONTH) + 1) + "월 " + 
						cal.get(Calendar.DATE) + "일");

	}

}
