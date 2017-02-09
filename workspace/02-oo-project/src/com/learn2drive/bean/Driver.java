package com.learn2drive.bean;

import java.util.Date;
import java.util.Set;

public class Driver {
	private String fullName;
	private Date dateOfbirth;
	private License license;
	private Set<Car> cars;
	public String getFullName() {
		return fullName;
	}
	public Driver() {
		super();
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	public Driver(String fullName, Date dateOfbirth, License license,
			Set<Car> cars) {
		super();
		this.fullName = fullName;
		this.dateOfbirth = dateOfbirth;
		this.license = license;
		this.cars = cars;
	}
	

}
