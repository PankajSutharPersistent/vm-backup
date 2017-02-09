/**
 * 
 */
package com.bean;

/**
 * @author Administrator
 *
 */
public class Product {
	private int itemCode;
	private String name;
	private float price;
	private int quantity;
	/**
	 * @param name
	 * @param itemCode
	 * @param price
	 */
	public Product(int itemCode, String name, float price,int quantity) {
		super();
		this.name = name;
		this.itemCode = itemCode;
		this.price = price;
		this.quantity=quantity;
	}
	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
