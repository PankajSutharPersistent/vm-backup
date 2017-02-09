package com.psl.datedemo;

import java.text.ParseException;
import java.util.Date;

public class DateClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date date=new Date();
	
		Date anotherDate=new Date(93, 10, 22, 13, 20, 25);
		System.out.println(date+" "+anotherDate);
		System.out.println(date.after(anotherDate));
		System.out.println(date.before(anotherDate));
		System.out.println(date.compareTo(anotherDate));
		System.out.println(date.getTime());
		date.setTime(148091938328l);
		System.out.println(date);
		
		
	}

}
