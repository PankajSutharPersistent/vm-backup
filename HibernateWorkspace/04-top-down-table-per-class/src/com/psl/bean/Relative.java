package com.psl.bean;

import java.sql.Date;

public class Relative extends Contact{
	
	private String relation;

	
	public Relative(String firstname, String lastName, String email,
			Date dateOfBirth, Address address, String relation) {
		super(firstname, lastName, email, dateOfBirth, address);
		this.relation = relation;
	}

	public Relative() {
		super();
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	

}
