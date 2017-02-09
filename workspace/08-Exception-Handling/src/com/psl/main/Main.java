package com.psl.main;

public class Main {
	
public static void main(String [] args)
	{
	try
	{
		String s="My name is Pankaj";
		System.out.println(s.charAt(45));
	}
	catch(StringIndexOutOfBoundsException e)
	{
	
		System.out.println(e.getMessage());
	}
	

}

}
