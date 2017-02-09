package com.psl.minimumintervalofrepition;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int MIN_DIFFERENCE =100,temp = n,diff;
		Calendar cal=new GregorianCalendar();
		cal.set(n, 11, 31);
	    int dayInNumber=cal.getTime().getDay();
	    cal.set(n, 0, 1);
	    int dayInNumberfirst=cal.getTime().getDay();
	    
		for(int i=n+1;i<n+100;i++)
		{
			cal.set(i, 11, 31);
			int a=cal.getTime().getDay();
			cal.set(i, 0, 1);
			int b=cal.getTime().getDay();
			if(dayInNumber==a && dayInNumberfirst==b)
			{	
				diff=i-temp;
				
				System.out.println(diff);
				if(diff<=MIN_DIFFERENCE)
				{
					MIN_DIFFERENCE=diff;
				}
				System.out.println(i+"   ----------"+diff);
				temp=i;
			}
			
			
		}
		System.out.println("----------------------------"+MIN_DIFFERENCE);
	}

}
