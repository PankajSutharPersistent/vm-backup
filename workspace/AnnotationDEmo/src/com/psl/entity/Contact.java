package com.psl.entity;

import java.sql.Date;

public class Contact {
	
	private int contactId;
	private String fname,lname;
	private Date dob;
	
	
	
	public Contact() {
		super();
	}
	public Contact(String fname, String lname, Date dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
}
