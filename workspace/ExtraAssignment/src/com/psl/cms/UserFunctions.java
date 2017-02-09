package com.psl.cms;

import java.util.HashMap;
import java.util.Scanner;

public class UserFunctions {
	HashMap<String, String> details=new HashMap<String, String>();
	
	public UserFunctions(){
		
	}
	public UserDetails CreateContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your \nName:\nContact No:\nMail Id");
		System.out.println();
		String name=sc.nextLine();
		String contactNo=sc.nextLine();
		String mail=sc.nextLine();
		UserDetails ud=new UserDetails(name, contactNo, mail);
		return ud;
		
	}
	public void SaveContact(UserDetails ud)
	{
		
		details.put(ud.getName(), ud.getContactNo()+"*"+ud.getMailId());
		System.out.println("Contact Saving...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Contact Has been saved...");
		
	}
	public void UpdateContcat()
	{
		System.out.println("You want to update contcat with name==>");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(details.containsKey(name))
		{
			System.out.println("Enter your \nNew Name:\nContact No:\nMail Id");
			System.out.println();
			String nname=sc.nextLine();
			String contactNo=sc.nextLine();
			String mail=sc.nextLine();
			
			details.put(nname, contactNo+"*"+mail);
		}
		else
		{
			System.out.println("Contact Doesn't exist");
		}
		
		
	}
	public void DeleteDetails()
	{
		
		System.out.println("You want to delete contcat with name==>");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(details.containsKey(name))
		{
			details.remove(name);
		}
		else
		{
			System.out.println("Contact Doesn't exist");
		}
		
	}

}
