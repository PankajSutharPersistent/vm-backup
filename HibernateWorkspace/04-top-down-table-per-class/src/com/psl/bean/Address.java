package com.psl.bean;

public class Address {
	private String city,country;

	
	
	public Address() {
		super();
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
	

}
