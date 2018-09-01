package com.day7;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class WeekDay {

	public static String displayWeekDay() {
		Date date1 = new Date(0);
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE,MMMM dd,YYYY");		
		String strDate = formatter.format(date1);
		System.out.println("Date Format with weekday,MMMM dd,YYYY : " + strDate);
		return strDate;
	}
}