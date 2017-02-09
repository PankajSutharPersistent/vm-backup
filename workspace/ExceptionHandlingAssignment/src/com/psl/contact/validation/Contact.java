package com.psl.contact.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.*;

public class Contact {
	private String firstName;
	private String lastName;
	private String mailid; 
	private String DOB;
	private String website;
	private String gender;
	private String aniversary;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private long mobileno;
	private long telephoneno;
	
	
	

	public Contact() {
		super();
	}




	public Contact(String firstName, String lastName, String mailid,
			String dOB, String website, String gender, String aniversary,
			String area, String city, String state, String country,
			int pincode, long mobileno, long telephoneno) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailid = mailid;
		DOB = dOB;
		this.website = website;
		this.gender = gender;
		this.aniversary = aniversary;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.mobileno = mobileno;
		this.telephoneno = telephoneno;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getMailid() {
		return mailid;
	}




	public void setMailid(String mailid) {
		this.mailid = mailid;
	}




	public String getDOB() {
		return DOB;
	}




	public void setDOB(String dOB) {
		DOB = dOB;
	}




	public String getWebsite() {
		return website;
	}




	public void setWebsite(String website) {
		this.website = website;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getAniversary() {
		return aniversary;
	}




	public void setAniversary(String aniversary) {
		this.aniversary = aniversary;
	}




	public String getArea() {
		return area;
	}




	public void setArea(String area) {
		this.area = area;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getPincode() {
		return pincode;
	}




	public void setPincode(int pincode) {
		this.pincode = pincode;
	}




	public long getMobileno() {
		return mobileno;
	}




	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}




	public long getTelephoneno() {
		return telephoneno;
	}




	public void setTelephoneno(long telephoneno) {
		this.telephoneno = telephoneno;
	}
	
	
	public static boolean validateData(String firstName, String lastName, String mailid,
			String dOB, String website, String gender, String aniversary,
			String area, String city, String state, String country,
			int pincode, long mobileno, long telephoneno)
	{
		int flag=0;
	
		if(firstName.equals(""))
		{
			flag=1;
			System.out.println("First Name is Mandatory");
		}
		if(lastName.equals(""))
		{
			flag=1;
			System.out.println("Last Name is Mandatory");
		}
		if(dOB.length()>0)
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			try {
				sdf.parse(dOB);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				flag=1;
				System.out.println("Enter Date of Birth in correct format");
				e.printStackTrace();
			}
		}
		if(dOB.length()==0)
		{
			flag=1;
			System.out.println("DOB is Mandatory");
		}
		if(mailid.equals(""))
		{
			flag=1;
			System.out.println("First Name is Mandatory");
		}
		if(mailid.length()>0)
		{
			if(mailid.contains("@"))
			{
				if(mailid.contains("."))
				{
				}
				else
				{
					flag=1;
					System.out.println("Enter Correct Mail ID");
				}
				
			}
			else
			{
				flag=1;
				System.out.println("Enter Correct Mail ID");
			}
			
		}
		if(mailid.length()==0)
		{
			flag=1;
			System.out.println("Mail Id is Mandatory");
		}
		if(mobileno==0)
		{
			if(telephoneno==0)
			{
				flag=1;
				System.out.println("Either Mobile no or Telephone no is mandatory");
			}
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact=new Contact();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your first name?");
		String fname=sc.nextLine();
		
		System.out.println("Enter your last name?");
		String lname=sc.nextLine();
		
		System.out.println("Enter your DOB?");
		String dob=sc.nextLine();
		
		System.out.println("Enter your gender(MALE/FEMALE)?");
		String gender=sc.nextLine();
		
		System.out.println("Enter your mail id?");
		String mailid=sc.nextLine();
		
		System.out.println("What is your website ?");
		String website=sc.nextLine();
		
		System.out.println("Enter your Anivrsry?");
		String anvrsry=sc.nextLine();
		
		System.out.println("Enter Address ");
		
		System.out.println("What is your area ?");
		String area=sc.nextLine();
		
		System.out.println("Enter your city?");
		String city=sc.nextLine();
		
		System.out.println("Enter your state?");
		String state=sc.nextLine();
		
		System.out.println("Enter your country?");
		String country=sc.nextLine();
		
		System.out.println("Enter your pin code?");
		int pincode=sc.nextInt();
		
		
		System.out.println("Enter your Mobile number?");
		long mnum=sc.nextLong();
		
		System.out.println("Enter your telephone number?");
		long tnum=sc.nextLong();
		
		Contact c=new Contact(fname, lname, mailid, dob, website, gender, anvrsry, area, city, state, country, pincode, mnum, tnum);
		boolean r=c.validateData(fname, lname, mailid, dob, website, gender, anvrsry, area, city, state, country, pincode, mnum, tnum);
		System.out.println("Data IS valid? "+r);
	}

}
