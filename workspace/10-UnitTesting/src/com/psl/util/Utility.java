package com.psl.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public double Power(int base, int index)
	{
		double result=1;
		for(int _index=index;_index!=0;)
		{
			result=result*base;
			_index =_index> 0 ? _index-1 :_index+1;
		}
		return index <0 ?1/result:result;
		
	}
	
	
	public static boolean validate(String emailStr) throws BlankEmail {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        if(emailStr.equals(null) || emailStr.trim().isEmpty())
        {
        	throw new BlankEmail();
        }
        return matcher.find();
	}
	
	public long factorial(long number)
	{
		long result=1;
		for(;number>0;number--)result*=number;
		
		return result;
		
		
		
	}

}
