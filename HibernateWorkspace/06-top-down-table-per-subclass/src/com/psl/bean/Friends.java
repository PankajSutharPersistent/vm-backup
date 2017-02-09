package com.psl.bean;

import java.sql.Date;

public class Friends extends Contact{
	
	private String petName;

	public Friends() {
		super();
	}

	

	



	public Friends(String firstname, String lastName, String email,
			Date dateOfBirth, Address address, String petName) {
		super(firstname, lastName, email, dateOfBirth, address);
		this.petName = petName;
	}







	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	

}
