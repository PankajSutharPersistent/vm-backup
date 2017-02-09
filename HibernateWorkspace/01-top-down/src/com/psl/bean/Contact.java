package com.psl.bean;

import java.sql.Date;

public class Contact {
	private int contactId;
	private String firstname,lastName;
	private String email;
	private Date dateOfBirth;
	
	
	public Contact() {
		super();
	}
	
	
	public Contact(String firstname, String lastName, String email,
			Date dateOfBirth) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}


	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
