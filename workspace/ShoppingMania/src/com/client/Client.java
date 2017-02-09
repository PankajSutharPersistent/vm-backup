package com.client;

import java.sql.Connection;
import java.util.List;

import com.bean.Category;
import com.bean.Product;
import com.bean.ShoppingCart;
import com.exception.ShoppingCartNotFoundException;

public class Client {

	//Use conn object for creating db connection
	static Connection conn;
	
	public static void main(String[] args) {
		// TODO: call methods you have implemented to present proper flow of menus with error handling etc
	}
	

	public List<Category> readAllCategoriesFromDb(){
		// TODO: read product category details from db and return a valid list
		return null;
	}
	
	public void populateCategoryProducts(List<Category> categoryList){	
		
		// TODO: read product details for each category from its file and set the products for each category in the list passed.

	}
	
	public ShoppingCart createShoppingCart(String userName, List<String> userInputProductNames,List<Category> categories){
		
		// TODO: create Shopping Cart in this method, apply validations to ignore the product names which are not existing in the categories Productlist.
		return null;
	}
	
	public void storeShoppingCartIntoDB(ShoppingCart cartObj ){
		
		//TODO: Save the shopping cart into shoppingCarts_tbl 	

	}
	
	public List<Product> sortShoppingCart(String userName) throws  ShoppingCartNotFoundException{
	
		//TODO: 
		//1. Get the Shopping Cart of the username from db
		//2. create a list of products sorted in descending order of product name		 
		//3. return the sorted list 	
		//4. In case the username is not found in database then throw ShoppingCartNotFoundException
		//Sorting is expected to be implemented in this method and not in db.
		return null;

	
	}
}	