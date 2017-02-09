package com.psl.cms;

public class UserDetails {
	private String name;
	private String contactNo;
	private String mailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public UserDetails(String name, String contactNo, String mailId) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.mailId = mailId;
	}
	
	

}
