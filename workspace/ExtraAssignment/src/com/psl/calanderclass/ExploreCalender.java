package com.psl.calanderclass;

import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ExploreCalender {
	public static void main(String [] args)
	{
		//Calendar cal=new GregorianCalendar().getInstance();
		
		Calendar cal;
		cal=Calendar.getInstance();
		Date date=new Date();
		System.out.println(date);
		long time=date.getTime();
		System.out.println(date);
		cal.add(Calendar.DATE, 10);
		System.out.println(cal.getTime());
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.YEAR);
		
	}

}
