package com.bean;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	public String name;
	List<Product> products;
	
	public ShoppingCart() { /* does nothing */ }
	public ShoppingCart(String name){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}	

}
