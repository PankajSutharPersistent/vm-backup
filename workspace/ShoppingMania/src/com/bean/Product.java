package com.bean;

import java.util.List;

public class Product {

	String title;	
	List<String> brands;
	
	public Product() { /* does nothing */ }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getBrands() {
		return brands;
	}
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	
	
}
