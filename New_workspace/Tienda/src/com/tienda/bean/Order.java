package com.tienda.bean;

import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.tienda.util.OrderStatus;

@XmlRootElement(name="order")
public class Order {
	
	private int orderId;
	private String number;
	private Date orderOn;
	private User orderBy;
	private Set<Product> cart;
	private OrderStatus status;
	public Order() {
		super();
	}
	public Order(int orderId, String number, Date orderOn, User orderBy,
			 OrderStatus status,Set<Product> cart) {
		super();
		this.orderId = orderId;
		this.number = number;
		this.orderOn = orderOn;
		this.orderBy = orderBy;
		this.cart = cart;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getOrderOn() {
		return orderOn;
	}
	public void setOrderOn(Date orderOn) {
		this.orderOn = orderOn;
	}
	public User getOrderedBy() {
		return orderBy;
	}
	public void setOrderedBy(User orderBy) {
		this.orderBy = orderBy;
	}
	
	//@XmlElementRef
	//@XmlElementWrapper(name="cart")
	public Set<Product> getCart() {
		return cart;
	}
	public void setCart(Set<Product> cart) {
		this.cart = cart;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	
	
}
