package com.psl.bean;

import java.sql.Date;

public class Employee extends Contact {
	
	private String employeeCode,desigation;
	
	

	public Employee() {
		super();
	}

	

	public Employee(String firstname, String lastName, String email,
			Date dateOfBirth, Address address, String employeeCode,
			String desigation) {
		super(firstname, lastName, email, dateOfBirth, address);
		this.employeeCode = employeeCode;
		this.desigation = desigation;
	}



	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getDesigation() {
		return desigation;
	}

	public void setDesigation(String desigation) {
		this.desigation = desigation;
	}
	
	

}
