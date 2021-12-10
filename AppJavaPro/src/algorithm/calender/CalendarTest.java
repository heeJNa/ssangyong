package algorithm.calender;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR,2021);
		cal.set(Calendar.MONTH,10);
		cal.set(Calendar.DATE,19);
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
