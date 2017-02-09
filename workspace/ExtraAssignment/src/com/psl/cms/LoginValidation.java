package com.psl.cms;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class LoginValidation {
	public boolean LoginValidationCheck(){
		System.out.println("Enter credentials-->");
		System.out.println("Username");
		Scanner sc=new Scanner(System.in);
		String usrname=sc.nextLine();
		System.out.println("Enter Password");
		String p=sc.nextLine();
		if(usrname.equalsIgnoreCase("admin") && p.equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
				
		
		
	}

}
