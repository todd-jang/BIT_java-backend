package chapter04;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR,2022);
		cal.set(Calendar.MONTH,11);//12(month-1)
		cal.set(Calendar.DATE,25);
		//cal.set(2022,2,28); Mona
		//cal.add(Calendar.DATE,1000);10000일이면..
		printDate(cal);
	}
	
	private static void printDate (Calendar cal) {
		final String[] DAYS= {"일","월","화","수","목","금","토"}
		
		int year=cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH);//0~11,+1
		int date=cal.get(Calendar.DATE);
		int day=cal.get(Calendar.DAY_OF_WEEK);//1(일)~7
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		
		System.out.println(
				year+"-"+
		        (month+1)+"-"+
				date+" "+
		        DAYS[day-1] +"요일"+"-"+
				
				
	}
}
