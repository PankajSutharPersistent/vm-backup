package com.psl.cms;

import java.util.Scanner;

public class ContactManagementSystem {
	
	
	public static void main(String []args)
	{
		LoginValidation lv=new LoginValidation();
		if(lv.LoginValidationCheck())
		{	int i;
			Scanner sc=new Scanner(System.in);
			do
			{
			System.out.println("Enter Choice==>");
			System.out.println("1=Create Contact and Save");
			System.out.println("2=Update Contact");
			System.out.println("3=Delete Contact");
			i=sc.nextInt();
			UserFunctions uf=new UserFunctions();
			switch (i) {
			case 1:
				UserDetails ud=uf.CreateContact();
				System.out.println("Contact has been created go for saving it");
				uf.SaveContact(ud);
				break;

			case 2:
				uf.UpdateContcat();
				
				break;
			case 3:
				uf.DeleteDetails();
				
				break;
			case 4:
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("You have enter wrong choice");
				break;
			}
		}while(i!=4);
		}
		else
		{
			System.out.println("Try Again!!");
		}
		
		
	}

}
