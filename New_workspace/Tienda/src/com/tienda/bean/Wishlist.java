package com.tienda.bean;

import java.util.Set;

public class Wishlist {

	private User wishedby;
	private int wishListId;
	private Set<Product> list;
	
	
	public Wishlist() {
		super();
	}
	public Wishlist( int wishListId,User wishedby, Set<Product> list) {
		super();
		this.wishedby = wishedby;
		this.wishListId = wishListId;
		this.list = list;
	}
	public User getWishedBy() {
		return wishedby;
	}
	public void setWishedBy(User wishedby) {
		this.wishedby = wishedby;
	}
	public int getWishListId() {
		return wishListId;
	}
	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}
	public Set<Product> getList() {
		return list;
	}
	public void setList(Set<Product> list) {
		this.list = list;
	}
	
	
}
