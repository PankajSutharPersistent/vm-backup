package com.tienda.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.Wishlist;
import com.tienda.service.TiendaService;
import com.tienda.util.WishlistNotFoundException;


public class WishList {
	
	@GET
	public Wishlist fetchWishlistForUser(@PathParam("username") String username) throws WishlistNotFoundException{
		
		
		return new TiendaService().getWishlistForUser(username);
		
	}

}
