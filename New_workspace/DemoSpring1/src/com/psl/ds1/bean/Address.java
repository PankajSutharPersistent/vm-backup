package com.psl.ds1.bean;

public class Address {
	private String street;
	private String city;
	private String zip;
	
	
	public Address() {
		super();
		System.out.println("In Employee ->constructor");

	}


	public Address(String street, String city, String zip) {
		super();
		System.out.println("In Employee ->Parameterized Constructor");

		this.street = street;
		this.city = city;
		this.zip = zip;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		System.out.println("In Employee ->setstreet");

		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		System.out.println("In Employee ->setCity");

		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		System.out.println("In Employee ->setZip");
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	
	
	
	

}
