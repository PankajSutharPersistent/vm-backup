package com.psl.contactinfo;

import java.util.Date;

public class Contact {
	private String firstName;
	private String lastName;
	private String mailid; 
	private String DOB;
	private String website;
	private Gender gender;
	private Date aniversary;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private int mobileno;
	private int telephoneno;
	
	
	

	public Contact() {
		super();
	}




	public Contact(String firstName, String lastName, String mailid,
			String dOB, String website, Gender gender, Date aniversary,
			String area, String city, String state, String country,
			int pincode, int mobileno, int telephoneno) {
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




	public Gender getGender() {
		return gender;
	}




	public void setGender(Gender gender) {
		this.gender = gender;
	}




	public Date getAniversary() {
		return aniversary;
	}




	public void setAniversary(Date aniversary) {
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




	public int getMobileno() {
		return mobileno;
	}




	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}




	public int getTelephoneno() {
		return telephoneno;
	}




	public void setTelephoneno(int telephoneno) {
		this.telephoneno = telephoneno;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Code for input user info here......................
		 * 
		 * */
		
	}

}
